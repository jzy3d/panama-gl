# panama-gl

This project explore Native OpenGL capabilities of Panama Early-Access Release.
JDK 17 incubation comes with [JEP-412 : Foreign Function & Memory API](https://openjdk.java.net/jeps/412) which offers a brand new way of accessing native libraries.

We here show how to use Panama to generate an OpenGL wrapper for Jzy3D, which already uses JOGL for GPU rendering and EmulGL for CPU rendering.

## Demos

These two demo open a native window. One can use the mouse to rotate the object, and double click to start an automatic rotation.

### SurfaceDemoPanamaGL
<img src="doc/panama-gl-surface.png"/>

### TeapotDemoPanamaGL
<img src="./doc/panama-gl-teapot.png"/>



## Run

You need to install [Panama Early-Access build](https://jdk.java.net/panama/).

### Run from IDE

Then run from Intellij ([Eclipse won't work yet](https://github.com/jzy3d/panama-gl/issues/3)) one of these demos
* SurfaceDemoPanamaGL
* TeapotDemoPanamaGL

This will require these VM arguments

#### MacOS 10.15.3
```
-XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/Current/Libraries/
```

#### MacOS 11.4

Not working yet! Despite code is generated and integrated, still have to locate OpenGL libs.

```
-XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/A/Libraries/
```

/opt/homebrew/Cellar/freeglut/3.2.1_1/lib

https://stackoverflow.com/questions/65802625/develop-using-opengl-4-x-on-osx-big-sur

#### Ubuntu 20

Need to resolve [how to start with foreign on Ubuntu](https://stackoverflow.com/questions/65861700/java-package-jdk-incubator-foreign-is-not-visible-error-in-java-15). 

### Run from CLI

#### Build

```
mvn clean install package
```

#### Run

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


## How I built the OpenGL wrappers

See the OpenGL example in [JExtract samples](https://github.com/sundararajana/panama-jextract-samples).

### Generate OpenGL Java wrappers with JExtract

This allows generating OpenGL Java Wrapper. The generated package is already in src/main/java so you don't need to do it, 
it is just a helper for adding wrappers for new platforms.

#### General pattern

```
jextract -d {OUTPUT_DIR} --source -t {PACKAGE_NAME} \
-lGL \
-l{GLUT_LIB_DIR} \
-I {GL_ANDGLUT_INCLUDE_DIR} \
-C{ARGS_FOR_CLANG} \
{GLUT_HEADER_FILE}
```

#### MacOS 10.15 
```
/Library/Java/JavaVirtualMachines/jdk-17.jdk-panama/Contents/Home/bin/jextract -d ./src/main/java/ --source -t opengl.macos.v10_15_3 \
  -lGL \
  -l/System/Library/Frameworks/GLUT.framework/Versions/Current/GLUT \
  -I  /Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/usr/include/ \
  -C-F/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/System/Library/Frameworks \
      /Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/System/Library/Frameworks/GLUT.framework/Headers/glut.h
```

#### MacOS 11.4

Can run JExtract but did not achieve to locate GL libraries yet.

```
/Library/Java/JavaVirtualMachines/jdk-17.jdk-panama/Contents/Home/bin/jextract -d ./src/main/java/ --source -t opengl.macos.v11_4 \
  -lGL -l/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/System/Library/Frameworks/GLUT.framework/Versions/A/GLUT.tbd \
  -I  /Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/usr/include \
  -C-F/Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/System/Library/Frameworks/ \
      /Library/Developer/CommandLineTools/SDKs/MacOSX.sdk/System/Library/Frameworks/GLUT.framework/Versions/A/Headers/glut.h
```

libGL.tbd is at /Library/Developer/CommandLineTools/SDKs/MacOSX11.3.sdk/System/Library/Frameworks/OpenGL.framework/Versions/A/Libraries
which indicates /System/Library/Frameworks/OpenGL.framework/Versions/A/Libraries/libGL.dylib
which is missing

#### Ubuntu 20

NB : can generate code but there is an issue when [building with Maven](https://bugs.debian.org/cgi-bin/bugreport.cgi?bug=980467).

```
/usr/lib/jvm/jdk-17-panama/bin/jextract  -d ./src/main/java/ --source -t opengl.ubuntu.v20 \
-lGL \
-l/usr/lib/x86_64-linux-gnu/libglut.so.3.9.0 \
-I  /usr/include/GL \
-C-F/usr/include/GL \
/usr/include/GL/glut.h
```


## Help

* Modules https://openjdk.java.net/projects/jigsaw/quick-start
* Modules https://github.com/tfesenko/Java-Modules-JPMS-CheatSheet
