
# Install tools and librairies to work with OpenGL on Ubuntu

```
# Install CLang for building C++
sudo apt install clang

# Install libraries to generate OpenGL bindings
sudo apt-get install freeglut3 freeglut3-dev libglew-dev
sudo apt-get install mesa-utils

# Check where the are installed
dpkg -L freeglut3


# For debugging

ldd --verbose /usr/lib/x86_64-linux-gnu/libGLU.so
```

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

## Generate bindings



### GL/GLU/GLUT

To generate Ubuntu 20 GLUT/GLU/GL binding

```sh
rm /src/main/java/opengl/ubuntu/v20/*
```


```
/usr/lib/jvm/jdk-17-panama/bin/jextract  -d ./src/main/java/ --source -t opengl.ubuntu.v20 \
-lGL \
-l/usr/lib/x86_64-linux-gnu/libglut.so.3.9.0 \
-l/usr/lib/x86_64-linux-gnu/libGLU.so.1.3.1 \
-l/usr/lib/x86_64-linux-gnu/libGLEW.so \
-I  /usr/include/GL \
-C-F/usr/include/GL \
/usr/include/GL/glut.h 
```
Output

```
WARNING: Using incubator modules: jdk.incubator.foreign, jdk.incubator.jextract
WARNING: skipping strtold because of unsupported type usage: long double
WARNING: skipping qecvt because of unsupported type usage: long double
WARNING: skipping qfcvt because of unsupported type usage: long double
WARNING: skipping qgcvt because of unsupported type usage: long double
WARNING: skipping qecvt_r because of unsupported type usage: long double
WARNING: skipping qfcvt_r because of unsupported type usage: long double
```


/usr/include/GL/glext.h

### GLEXT

To generate Ubuntu 20 GLEXT binding

```sh
rm /src/main/java/opengl/glext/ubuntu/v20/*
```


```
/usr/lib/jvm/jdk-17-panama/bin/jextract  -d ./src/main/java/ --source -t opengl.glext.ubuntu.v20 \
-lGL -l/usr/lib/x86_64-linux-gnu/libglut.so.3.9.0 \
-l/usr/lib/x86_64-linux-gnu/libGLU.so.1.3.1 \
-l/usr/lib/x86_64-linux-gnu/libGLEW.so \
-I  /usr/include/GL \
-C-F/usr/include/GL \
/usr/include/GL/glext.h
```


### GLX

To generate Ubuntu 20 GLX binding

```sh
rm /src/main/java/opengl/glx/ubuntu/v20/*
```


```
/usr/lib/jvm/jdk-17-panama/bin/jextract  -d ./src/main/java/ --source -t opengl.glx.ubuntu.v20 \
-lGL \
-l/usr/lib/x86_64-linux-gnu/libGLX.so \
-I  /usr/include/GL \
-C-F/usr/include/GL \
/usr/include/GL/glx.h
```

Output

```
WARNING: Using incubator modules: jdk.incubator.jextract, jdk.incubator.foreign
WARNING: skipping .__clang_max_align_nonce2 because of unsupported type usage: long double
```

### GLEW

To generate Ubuntu 20 GLEW binding

```sh
rm /src/main/java/opengl/glew/ubuntu/v20/*
```


```
/usr/lib/jvm/jdk-17-panama/bin/jextract  -d ./src/main/java/ --source -t opengl.glew.ubuntu.v20 \
-lGL \
-l/usr/lib/x86_64-linux-gnu/libGLEW.so \
-I  /usr/include/GL \
-C-F/usr/include/GL \
/usr/include/GL/glew.h
```

Output

```
WARNING: Using incubator modules: jdk.incubator.foreign, jdk.incubator.jextract
WARNING: skipping .__clang_max_align_nonce2 because of unsupported type usage: long double
```
