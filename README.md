CurseGradle
===========

This gradle plugin is for easy use of the CurseForge system and allow for automated uploads to CurseForge

# Usage
To use this plugin you will need to add to your ```buildscript { }``` block in your build.gradle:

```groovy
buildscript {
    repositories {
        maven {
            name = 'Cazzar's Maven repo'
            url = 'http://maven.cazzar.net/'
        }
    }
    dependencies {
        classpath 'net.cazzar:CurseForgeUploader:1.0'
    }
}

apply plugin: 'curseforge'
```

To configure an upload task, you will need to configure with the CurseForge API key which you can obtain from https://www.curseforge.com/home/api-key/

to configure the supplied task that the plugin creates you do it in the ```uploadToCurseForge``` block for example

```groovy
uploadToCurseForge {
    api_key 'API_KEY'
    stub 'URL_STUB'
    artifact_name 'NAME_ON_CURSEFORGE'
    game_version 'GAME_VERSION'
    artifact 'ARTIFACT_TO_UPLOAD'
    change_log 'CHANGELOG'
}
```