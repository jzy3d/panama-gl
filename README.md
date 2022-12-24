# panama-gl

This project explore Native OpenGL capabilities of Panama Early-Access Release as candidate to complement JOGL and ensure JOGL's future on JDK>17.
.
JDK 17 incubation comes with [JEP-412 : Foreign Function & Memory API](https://openjdk.java.net/jeps/412) which offers a brand new way of accessing native libraries.

We here show how to use Panama to generate an OpenGL wrapper for Jzy3D, which already uses JOGL for GPU rendering and EmulGL for CPU rendering.

## Documentation

### Setup your computer
* [Setup base for everyone](doc/setup/setup_everyone.md)
* [Setup on Linux](doc/setup/setup_ubuntu.md)
* [Setup on macOS](doc/setup/setup_macos.md)
* [Setup on Windows](doc/setup/setup_windows.md)

### Help on technologies used in this project
* [Panama Foreign Help](doc/Panama-Foreign-help.md)
* [OpenGL Help](doc/OpenGL-help.md)
* [Modules Quickstart](https://openjdk.java.net/projects/jigsaw/quick-start)
* [Modules Cheatsheet](https://github.com/tfesenko/Java-Modules-JPMS-CheatSheet)

### Design of Panama GL
* [PanamaGL Design](doc/PanamaGL-Design.md)


## Demos

### 3D offscreen GL demo

* `TestFBO_macOS` and `DemoFBO_Offscreen_macOS`

### 3D onscreen GL demos
These two demo open a *native* window with Jzy3D (hence not a Java window yet). One can use the mouse to rotate the object, and double click to start an automatic rotation.

| `SurfaceDemoPanamaGL`| `TeapotDemoPanamaGL`|
|-|-|
| <img src="doc/panama-gl-surface.png"/> | <img src="./doc/panama-gl-teapot.png"/> |

### Run demos

You need to install [Panama Early-Access build](https://jdk.java.net/panama/).

#### Run from IDE

Then run from Intellij ([Eclipse won't work yet](https://github.com/jzy3d/panama-gl/issues/3)) one of these demos
* SurfaceDemoPanamaGL
* TeapotDemoPanamaGL

There is no automatic OS detection yet so you should verify if the `Painter` is the good one :

```java
ChartFactory factory = new PanamaGLChartFactory(new PanamaGLPainterFactory_MacOS_10_15_3());
//ChartFactory factory = new PanamaGLChartFactory(new PanamaGLPainterFactory_MacOS_11_4());
```

Running the program will require extra VM arguments as shown below.

##### MacOS 10.15.3
```
-XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/Current/Libraries/
```

##### MacOS 11.4

Not working yet! Despite code is generated and integrated, still have to locate OpenGL libs.

```
-XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/A/Libraries/
```

/opt/homebrew/Cellar/freeglut/3.2.1_1/lib

https://stackoverflow.com/questions/65802625/develop-using-opengl-4-x-on-osx-big-sur

##### Ubuntu 20

```
--enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign -Djava.library.path=.:/usr/lib/x86_64-linux-gnu/
```

#### Run from CLI

##### Build

```
mvn clean install package
```

##### Run

Check JRE is Panama
```
java -version
openjdk version "17-panama" 2021-09-14
```

Run from command line with these VM args (see below the appropriate VM args for an IDE)

```
java -XstartOnFirstThread \
    --enable-native-access=ALL-UNNAMED \
    --add-modules jdk.incubator.foreign \
    -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/Current/Libraries/ \
    -jar target/panama-gl-2.0.1-SNAPSHOT.jar \
    Teapot
```


## How I built the OpenGL bindings

See [the setup section](doc/setup) 

## Troubleshooting

An `UnsatisfiedLinkError` is thrown while invoking a bounded function.

Cause : the underlying method handle is null because the native library has not been loaded explicitely by the generated code.
This may occur if jextract is given a header file and an incomplete list of libraries.

`java: package jdk.incubator.foreign is not visible` message when running from IntelliJ.

Solution : ensure these 3 settings
- in addition to setting VM parameters in the Run Configuration
- add --add-modules jdk.incubator.foreign under Preferences -> Build, Execution, Development -> Compiler -> Java Compiler -> Additional command line parameters
- in the same window, set the target bycode version to the VM version we run on (here 17).

## Design

The design of the library is defined [here](doc/PanamaGL-Design.md) but roughly described in the schema below.

<img src="PanamaGL-Design.png"/>

