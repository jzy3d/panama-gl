package opengl;

/**
 * A {@link GLContext} is responsible for establishing an OpenGL context with the OS
 * libraries, allowing to then invoke OpenGL methods.
 *
 * The actual context will depend on OS resolution and available implementations.
 * Each OS requires dedicated libraries able to initiate a context
 *
 * <ul>
 *     <li>Linux : GLX, ?</li>
 *     <li>macOS : GLUT, CGL, ?</li>
 *     <li>Windows : GLUT, WGL, ?</li>
 * </ul>
 */
public interface GLContext {
    void init();
}
