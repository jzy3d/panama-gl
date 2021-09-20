# panama-gl


## Get

* [Panama Early Build](https://jdk.java.net/panama/)
* [JExtract samples](https://github.com/sundararajana/panama-jextract-samples)

## Generate Java Code with JExtract

```
jextract -d ./target/java/ --source -t opengl -lGL -l/System/Library/Frameworks/GLUT.framework/Versions/Current/GLUT \
  -I /Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/usr/include/ \
  -C-F/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/System/Library/Frameworks \
  /Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/System/Library/Frameworks/GLUT.framework/Headers/glut.h
```

TODO : add target package with OS name & version


```
javac --add-modules jdk.incubator.foreign opengl/*.java
```

## Build Maven project

Copy to a Maven project having jzy3D in path

```
cp target/opengl/* /Users/martin/Dev/jzy3d/public/panama-gl/src/main/java/opengl
cp *.java /Users/martin/Dev/jzy3d/public/panama-gl/src/main/java/
```


This one build a fat jar with all dependencies
```
mvn install -D--add-modules jdk.incubator.foreign
```

## Run

Check JRE is Panama
```
java -version
openjdk version "17-panama" 2021-09-14
```

Run from command line
```
java -jar target/panama-gl-2.0.1-SNAPSHOT.jar \
    -XstartOnFirstThread \
    --enable-native-access=ALL-UNNAMED \
    --add-modules jdk.incubator.foreign \
    -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/Current/Libraries/ Teapot
```


Add to IDE VM args
```
-XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign \
    -Djava.library.path=.:/System/Library/Frameworks/OpenGL.framework/Versions/Current/Libraries/
```
