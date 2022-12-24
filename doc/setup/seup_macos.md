
# Install tools and librairies to work with OpenGL on macOS

* Get [XCode as required by your macOS](https://developer.apple.com/support/xcode/) version (or use App Store but forces latest version for later OS not always supported by old MacBooks)

* After logging with an Apple ID, search the XCode version that fits your OS : https://developer.apple.com/download/all/?q=xcode%2012.4

# How I built the OpenGL bindings

See the OpenGL example in [JExtract samples](https://github.com/openjdk/jextract/tree/master/samples).

## Generate OpenGL Java bindings with JExtract

This allows generating OpenGL Java Wrapper. The generated packages are already in `src/main/java` so you don't need to do it,
it is just a helper for adding wrappers for new platforms.

### General pattern

```
jextract -d {OUTPUT_DIR} --source -t {PACKAGE_NAME} \
-lGL \
-l{GLUT_LIB} \
-I {GL_AND_GLUT_INCLUDE_DIR} \
-C{ARGS_FOR_CLANG} \
{GLUT_HEADER_FILE}
```

### MacOS 10.15
```
/Library/Java/JavaVirtualMachines/jdk-17.jdk-panama/Contents/Home/bin/jextract -d ./src/main/java/ --source -t opengl.macos.v10_15_3 \
  -lGL \
  -l/System/Library/Frameworks/GLUT.framework/Versions/Current/GLUT \
  -I  /Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/usr/include/ \
  -C-F/Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/System/Library/Frameworks \
      /Applications/Xcode.app/Contents/Developer/Platforms/MacOSX.platform/Developer/SDKs/MacOSX.sdk/System/Library/Frameworks/GLUT.framework/Headers/glut.h
```

### MacOS 11.4

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