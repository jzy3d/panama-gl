// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXSTREAM2IATIPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLVERTEXSTREAM2IATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM2IATIPROC.class, fi, constants$504.PFNGLVERTEXSTREAM2IATIPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXSTREAM2IATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM2IATIPROC.class, fi, constants$504.PFNGLVERTEXSTREAM2IATIPROC$FUNC, "(III)V", scope);
    }
    static PFNGLVERTEXSTREAM2IATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$504.PFNGLVERTEXSTREAM2IATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


