// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBUFFERSTORAGEEXTERNALEXTPROC {

    void apply(int x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3, int x4);
    static MemoryAddress allocate(PFNGLBUFFERSTORAGEEXTERNALEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBUFFERSTORAGEEXTERNALEXTPROC.class, fi, constants$707.PFNGLBUFFERSTORAGEEXTERNALEXTPROC$FUNC, "(IJJLjdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLBUFFERSTORAGEEXTERNALEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBUFFERSTORAGEEXTERNALEXTPROC.class, fi, constants$707.PFNGLBUFFERSTORAGEEXTERNALEXTPROC$FUNC, "(IJJLjdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLBUFFERSTORAGEEXTERNALEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3, int x4) -> {
            try {
                constants$707.PFNGLBUFFERSTORAGEEXTERNALEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


