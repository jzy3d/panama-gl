Install
* Freeglut MSVC Package from [there](https://www.transmissionzero.co.uk/software/freeglut-devel/)
* CLang

## How I built the OpenGL wrappers

See the OpenGL example in [JExtract samples](https://github.com/openjdk/jextract/tree/master/samples).

### Generate OpenGL Java wrappers with JExtract

This allows generating OpenGL Java Wrapper. The generated packages are already in `src/main/java` so you don't need to do it,
it is just a helper for adding wrappers for new platforms.

#### General pattern

```
jextract -d {OUTPUT_DIR} --source -t {PACKAGE_NAME} \
-lGL \
-l{GLUT_LIB} \
-I {GL_AND_GLUT_INCLUDE_DIR} \
-C{ARGS_FOR_CLANG} \
{GLUT_HEADER_FILE}
```

```
C:\Program" "Files\Java\openjdk-19-panama_windows-x64_bin\jdk-19\bin\jextract.exe -d ./src/main/java/ --source -t opengl.windows.v10.jdk17 `
-I "C:\Users\Martin\Dev\jzy3d\external\freeglut\include" `
"-l" opengl32 `
"-l" glu32 `
"-l" freeglut `
"--" `
"C:\Users\Martin\Dev\jzy3d\external\freeglut\include\GL\freeglut.h"
```

Fails on Windows with JDK 17 

```
C:\Program" "Files\Java\openjdk-17-panama+3-167_windows-x64_bin\jdk-17\bin\jextract.exe -d ./src/main/java/ --source -t opengl.windows.v10.jdk17 `
-I "C:\Users\Martin\Dev\jzy3d\external\freeglut\include" `
"-l" opengl32 `
"-l" glu32 `
"-l" freeglut `
"--" `
"C:\Users\Martin\Dev\jzy3d\external\freeglut\include\GL\freeglut.h"
```