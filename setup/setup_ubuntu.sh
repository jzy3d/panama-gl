# Install CLang for building C++
sudo apt install clang

# Install libraries to generate OpenGL bindings
sudo apt-get install freeglut3 freeglut3-dev libglew-dev
sudo apt-get install mesa-utils

# Check where the are installed
dpkg -L freeglut3


# For debugging

ldd --verbose /usr/lib/x86_64-linux-gnu/libGLU.so



# Generate bindings
rm /src/main/java/opengl/ubuntu/v20/*
/usr/lib/jvm/jdk-17-panama/bin/jextract  -d ./src/main/java/ --source -t opengl.ubuntu.v20 \
-lGL \
-l/usr/lib/x86_64-linux-gnu/libglut.so.3.9.0 \
-l/usr/lib/x86_64-linux-gnu/libGLU.so.1.3.1 \
-l/usr/lib/x86_64-linux-gnu/libGLEW.so \
-I  /usr/include/GL \
-C-F/usr/include/GL \
/usr/include/GL/glut.h