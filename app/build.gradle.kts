plugins {
    id("com.dsulimchuk.kotlin-application-conventions")
}

dependencies {
    implementation("org.apache.commons:commons-text")
    implementation(project(":model"))
    implementation(project(":utilities"))
}

application {
    mainClass.set("com.dsulimchuk.app.AppKt")
}
