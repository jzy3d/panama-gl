// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETPATHLENGTHNVPROC {

    float apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLGETPATHLENGTHNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHLENGTHNVPROC.class, fi, constants$885.PFNGLGETPATHLENGTHNVPROC$FUNC, "(III)F");
    }
    static MemoryAddress allocate(PFNGLGETPATHLENGTHNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPATHLENGTHNVPROC.class, fi, constants$885.PFNGLGETPATHLENGTHNVPROC$FUNC, "(III)F", scope);
    }
    static PFNGLGETPATHLENGTHNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                return (float)constants$885.PFNGLGETPATHLENGTHNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


