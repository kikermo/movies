## Nutmeg Take Home Test App

Basic showcase app that shows a list of photos from https://jsonplaceholder.typicode.com/  API

### Tech stack
Architecture: MVVM + Clean Architecture\
Featured Libs: Hilt, Jetpack Compose, Retrofit\
Tests: JUnit unit tests and Basic Compose UI tests

#### Building the app

```bash
./gradlew assembleDebug
```

### Running the unit tests

Simply run:

```bash
./gradlew testDebugUnitTest
```

### Running the UI tests

With a connected device or emulator
```bash
./gradlew connectedDebugAndroidTest 
```

It can also be run using Gradle Managed Devices which runs the tests on a headless emulator giving back the results

```bash
./gradlew pixel2Api33DebugAndroidTest 
```
# movies
