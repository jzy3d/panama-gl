// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDEBUGMESSAGEINSERTARBPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, jdk.incubator.foreign.MemoryAddress x5);
    static MemoryAddress allocate(PFNGLDEBUGMESSAGEINSERTARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDEBUGMESSAGEINSERTARBPROC.class, fi, constants$319.PFNGLDEBUGMESSAGEINSERTARBPROC$FUNC, "(IIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDEBUGMESSAGEINSERTARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDEBUGMESSAGEINSERTARBPROC.class, fi, constants$319.PFNGLDEBUGMESSAGEINSERTARBPROC$FUNC, "(IIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDEBUGMESSAGEINSERTARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, jdk.incubator.foreign.MemoryAddress x5) -> {
            try {
                constants$319.PFNGLDEBUGMESSAGEINSERTARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


