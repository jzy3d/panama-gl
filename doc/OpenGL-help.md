OpenGL is more than just single library and it is worth mentionning existing variations and extensions library that exists in this ecosystem.


# Main drawing libraries libraries

* GL (.h) is the core openGL at version 1.1, allowing to send instructions to the GPU
* GLU (.h) is a utility library providing additional functions to GL
* GLEXT exposes openGL after version 1.1 (see the [registry](https://registry.khronos.org/OpenGL/index_gl.php#headers) for more details)



# Libraries linking windows to drawing

## Generic windowing libraries

_"Initializing an OpenGL context"_ means getting access to the GPU to query a drawing region either on screen or off screen (in an invisible window). 
GL and GLU are not able to do so on their own and are not enough. 
We hence use the following _generic_ (multi-os) libraries to establish a GL context for a drawing area.

* GLUT (.h) is a helper to easily create windows and hence initialize an OpenGL context on MacOS and Windows
* EGL is a library similar to GLUT, allowing to link OpenGL drawing to system windows. It is not available everywhere.
 
## OS specific windowing libraries

* [CGL](https://en.wikipedia.org/wiki/Core_OpenGL) is one of the macOS library allowing to initialize an OpenGL context
* WGL is the Windows library allowing to initialize an OpenGL context
* GLX is the Linux library allowing to initialize an OpenGL context

# OpenGL versions

OpenGL has several versions from 1.0 to 4.6. Although most recent computers support OpenGL 4.*, the actual ability of a computer to support a given 
OpenGL version is decided by GPU capabilities and the manufacturer effort.

As of version 2 (OR 3?), OpenGL has grown through extensions that either became merged to the main specification few versions later, 
either remained extensions (think as plugin) that some GPU manufacturers implement or do not implement.

As such, part of the drawing capabilities are known at runtime. Discovering these is helped through

* the GLEXT library
* the GLEW library
* the GL_VENDOR, GL_VERSION, GL_EXTENSIONS commands offered by the GL library. 

List of GPU and supported OpenGL versions
http://opengl.gpuinfo.org/


# To clarify

? what is [GLFW](https://www.glfw.org/)?
? what is GLDispatch?
