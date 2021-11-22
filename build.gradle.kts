plugins {
    java
    distribution
    maven
    id("org.omegat.gradle") version "1.5.3"
}

version = "1.1.0"

omegat {
    version = "5.7.0"
    pluginClass = "net.libretraduko.omegat.YandexTranslate"
}

dependencies {
}

distributions {
    main {
        contents {
            from(tasks["jar"], "README.md", "COPYING")
        }
    }
}
