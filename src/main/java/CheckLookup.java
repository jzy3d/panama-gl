/*import jdk.incubator.foreign.SymbolLookup;
import opengl.ubuntu.v20.RuntimeHelper;
import opengl.ubuntu.v20.glut_h;

public class CheckLookup {
    public static void main(String[] args){
        System.loadLibrary("GL");
        System.load("/usr/lib/x86_64-linux-gnu/libglut.so.3.9.0");
        System.load("/usr/lib/x86_64-linux-gnu/libGLU.so.1.3.1");

        SymbolLookup LIBRARIES = RuntimeHelper.lookup();
        check(LIBRARIES, "glLoadIdentity");
        check(LIBRARIES, "gluLookAt");
    }

    public static void check(SymbolLookup LIBRARIES, String function){
        System.out.println(LIBRARIES.lookup(function));
    }
}*/
