// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSHADEROP1EXTPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLSHADEROP1EXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSHADEROP1EXTPROC.class, fi, constants$683.PFNGLSHADEROP1EXTPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLSHADEROP1EXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSHADEROP1EXTPROC.class, fi, constants$683.PFNGLSHADEROP1EXTPROC$FUNC, "(III)V", scope);
    }
    static PFNGLSHADEROP1EXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$683.PFNGLSHADEROP1EXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


