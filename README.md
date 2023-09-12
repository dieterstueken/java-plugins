# java-plugins
Example of using the ServiceLoader to load plugins from the classpath.

Module `Planet` defines the plugin. `Earth` and `Mars` are two implementations.

Module `System` is just a configuration to define a classpath including all planets.

The main `build.gradle` defines `idea.project.settings.runConfigurations` using the idea-ext plugin.

Choosing `delegateBuildRunToGradle = true` works as expected. However, running it by gradle instead does not include any planet.
Seems gradle uses the classpath of the main class, only.



