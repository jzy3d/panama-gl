// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTEXBUFFERARBPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLTEXBUFFERARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXBUFFERARBPROC.class, fi, constants$374.PFNGLTEXBUFFERARBPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLTEXBUFFERARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXBUFFERARBPROC.class, fi, constants$374.PFNGLTEXBUFFERARBPROC$FUNC, "(III)V", scope);
    }
    static PFNGLTEXBUFFERARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$374.PFNGLTEXBUFFERARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

