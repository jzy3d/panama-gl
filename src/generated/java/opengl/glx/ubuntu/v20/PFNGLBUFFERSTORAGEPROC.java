// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBUFFERSTORAGEPROC {

    void apply(int x0, long x1, jdk.incubator.foreign.MemoryAddress x2, int x3);
    static MemoryAddress allocate(PFNGLBUFFERSTORAGEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBUFFERSTORAGEPROC.class, fi, constants$352.PFNGLBUFFERSTORAGEPROC$FUNC, "(IJLjdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLBUFFERSTORAGEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBUFFERSTORAGEPROC.class, fi, constants$352.PFNGLBUFFERSTORAGEPROC$FUNC, "(IJLjdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLBUFFERSTORAGEPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, jdk.incubator.foreign.MemoryAddress x2, int x3) -> {
            try {
                constants$352.PFNGLBUFFERSTORAGEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


