//Compile with "g++ <filename>.cpp -std=c++11 -lX11 -lGL"

#include <cassert>
#include <cstdio>

#include <X11/Xlib.h>
#include <X11/Xutil.h>
#include <X11/keysym.h>

#include <GL/glx.h>


static Display* display;


static void _x11_map_window(Window window) {
    printf("Mapping window %lu; RETURN to continue\n",window); getchar();
    XMapWindow(display, window);
    printf("Mapped window!  RETURN to continue\n"); getchar();
}
static void _x11_unmap_window(Window window) {
    printf("Unmapping window %lu; RETURN to continue\n",window); getchar();
    XUnmapWindow(display, window);
    printf("Unmapped window!  RETURN to continue\n"); getchar();
}


int main(int argc, char* argv[]) {
    /* ##### MAKE DISPLAY ##### */
    display = XOpenDisplay(nullptr);


    /* ##### MAKE VISUAL INFO. ##### */
    int attributes[] = { //can't be const b/c X11 doesn't like it.  Not sure if that's intentional or just stupid.
        GLX_RGBA, //apparently nothing comes after this?
        GLX_RED_SIZE,    8,
        GLX_GREEN_SIZE,  8,
        GLX_BLUE_SIZE,   8,
        GLX_ALPHA_SIZE,  8,
        //Ideally, the size would be 32 (or at least 24), but I have actually seen
        //  this size (on a modern OS even).
        GLX_DEPTH_SIZE, 16,
        GLX_DOUBLEBUFFER, True,
        None
    };

    #pragma GCC diagnostic push
    #pragma GCC diagnostic ignored "-Wold-style-cast" //Because of X11's cruft in "DefaultScreen".
    XVisualInfo* visual_info = glXChooseVisual(display, DefaultScreen(display), attributes);
    #pragma GCC diagnostic pop
    assert(visual_info!=nullptr);


    /* ##### MAKE WINDOW ##### */
    Window parent = XDefaultRootWindow(display);

    Colormap colormap = XCreateColormap(display, parent, visual_info->visual, AllocNone);

    XSetWindowAttributes window_attributes_set;
    window_attributes_set.colormap = colormap;
    window_attributes_set.background_pixel = 0; //This and next b/c of http://stackoverflow.com/questions/3645632/how-to-create-a-window-with-a-bit-depth-of-32
    window_attributes_set.border_pixel = 0;     //especially resulting in BadMatch error on Raspberry Pi.  Also changes bit fields below in XCreateWindow.
    window_attributes_set.event_mask = ExposureMask | KeyPressMask;

    int position[2]={50,50}, dimensions[2]={128,128};
    Window window = XCreateWindow(
        display, parent,
        position[0],position[1], static_cast<unsigned int>(dimensions[0]),static_cast<unsigned int>(dimensions[1]), //Note: the documentation must be wrong; this thing wants unsigned ints.
        0u,
        visual_info->depth,
        InputOutput,
        visual_info->visual,
        //CWColormap|CWEventMask,
        CWBackPixel|CWColormap|CWBorderPixel | CWEventMask,
        &window_attributes_set
    );
    assert(window!=0);
    printf("Created window %lu\n",window);
    XStoreName(display, window, "[default title]");
    XSelectInput(display, window,
        //http://www.tronche.com/gui/x/xlib/events/mask.html#NoEventMask
        //http://www.tronche.com/gui/x/xlib/events/processing-overview.html
        ExposureMask |
        KeyPressMask | KeyReleaseMask |
        ButtonPressMask | ButtonReleaseMask | //ButtonMotionMask |
        //EnterWindowMask | LeaveWindowMask |
        PointerMotionMask |
        //KeymapStateMask | FocusChangeMask | ColormapChangeMask |
        StructureNotifyMask //Resizing, etc.
        //PropertyChangeMask
    );

    Atom wm_delete = XInternAtom(display, "WM_DELETE_WINDOW", True);
    XSetWMProtocols(display, window, &wm_delete, 1);

    XMoveWindow(display, window, 100,100);

    //As described here: http://stackoverflow.com/questions/14801536/xmovewindow-not-working-before-xmapwindow
    //  "the X server doesn't have to know about a window before it is mapped for the first time".  Hence,
    //  map the window and then unmap it so that the X server knows about it.  This is important because some
    //  functions silently fail (e.g. XMoveWindow) when the X server is oblivious.
    _x11_map_window(window);
    _x11_unmap_window(window);


    /* ##### MAKE RENDER CONTEXT ##### */
    GLXContext render_context = glXCreateContext(display, visual_info, nullptr, True);
    assert(render_context!=nullptr);


    /* ##### MORE STUFF WOULD GO HERE ##### */
    while (1);

    return 0;
}
