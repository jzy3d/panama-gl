## Install
* Freeglut MSVC Package from [there](https://www.transmissionzero.co.uk/software/freeglut-devel/)
* CLang

## Generate GL Wrappers on Windows

C:\Program" "Files\Java\openjdk-19-panama_windows-x64_bin\jdk-19\bin\jextract.exe -d ./src/main/java/ --source -t opengl.windows.v10 `
-I "C:\Users\Martin\Dev\jzy3d\external\freeglut\include" `
"-l" opengl32 `
"-l" glu32 `
"-l" freeglut `
"--" `
"C:\Users\Martin\Dev\jzy3d\external\freeglut\include\GL\freeglut.h"

WARNING: Using incubator modules: jdk.incubator.foreign, jdk.incubator.jextract
WARNING: Layout size not available for Policies
WARNING: Layout size not available for Elements
WARNING: Layout size not available for pEventLogRecords
WARNING: Layout size not available for ulOffsets
WARNING: skipping wcstold because of unsupported type usage: long double
WARNING: skipping _wcstold_l because of unsupported type usage: long double
WARNING: skipping .x because of unsupported type usage: long double
WARNING: skipping strtold because of unsupported type usage: long double
WARNING: skipping _strtold_l because of unsupported type usage: long double