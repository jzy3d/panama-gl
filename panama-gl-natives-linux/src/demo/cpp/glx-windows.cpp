Display *dpy;             /* display variable */
XVisualInfo *vi;          /* visual variable */
Window win;               /* window variable */
GLXDrawable drawable;     /* drawable variable */
GLXContext cx, cxTemp;    /* rendering context variables */

/* Code to open a display and get a visual. */

/* Create a GLX context. */
cx = glXCreateContext(dpy, vi, 0, GL_FALSE);
if (!cx) {
    fprintf(stderr, "Cannot create context.\n");
    exit(-1);
}

        .
/* Connect the context to the window. */
glXMakeCurrent(dpy, win, cx);

        .
/* When it's time to destroy the rendering context. . . */
cx = glXGetCurrentContext;
glXDestroyContext(dpy, cx);
