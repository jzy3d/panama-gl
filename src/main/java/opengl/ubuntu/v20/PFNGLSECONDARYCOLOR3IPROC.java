// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSECONDARYCOLOR3IPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3IPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3IPROC.class, fi, constants$97.PFNGLSECONDARYCOLOR3IPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3IPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3IPROC.class, fi, constants$97.PFNGLSECONDARYCOLOR3IPROC$FUNC, "(III)V", scope);
    }
    static PFNGLSECONDARYCOLOR3IPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$97.PFNGLSECONDARYCOLOR3IPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


