plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Zavu Unified Messaging Layer API")
                description.set("Unified multi-channel messaging API for Zavu.\n\nSupported channels:\n\n- **SMS**: Simple text messages\n- **WhatsApp**: Rich messaging with media, buttons, lists, CTA URL buttons,\n  location requests, and templates\n- **Telegram**: Bot messaging with text, media, and interactive elements\n- **Email**: Transactional emails via Amazon SES\n\nDesign goals:\n\n- Simple `send()` entrypoint for developers\n- Project-level authentication via Bearer token\n- Support for all WhatsApp message types (text, image, video, audio, document,\n  sticker, location, contact, buttons, list, cta_url, location_request,\n  reaction, template)\n- If a non-text message type is sent, WhatsApp channel is used automatically\n- 24-hour WhatsApp conversation window enforcement\n- Universal `to` field accepts phone numbers (E.164), email addresses, or\n  numeric chat IDs (Telegram/Instagram/Messenger)")
                url.set("https://docs.zavu.dev")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Zavudev")
                        email.set("hi@zavu.dev")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/zavudev-java.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/zavudev-java.git")
                    url.set("https://github.com/stainless-sdks/zavudev-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
    repositories {
        if (project.hasProperty("publishLocal")) {
            maven {
                name = "LocalFileSystem"
                url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
