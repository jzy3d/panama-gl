// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDEBUGMESSAGEINSERTAMDPROC {

    void apply(int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLDEBUGMESSAGEINSERTAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDEBUGMESSAGEINSERTAMDPROC.class, fi, constants$536.PFNGLDEBUGMESSAGEINSERTAMDPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDEBUGMESSAGEINSERTAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDEBUGMESSAGEINSERTAMDPROC.class, fi, constants$536.PFNGLDEBUGMESSAGEINSERTAMDPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDEBUGMESSAGEINSERTAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$536.PFNGLDEBUGMESSAGEINSERTAMDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


