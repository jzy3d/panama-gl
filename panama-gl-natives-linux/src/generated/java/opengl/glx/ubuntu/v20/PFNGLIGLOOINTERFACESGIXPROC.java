// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLIGLOOINTERFACESGIXPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLIGLOOINTERFACESGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLIGLOOINTERFACESGIXPROC.class, fi, constants$984.PFNGLIGLOOINTERFACESGIXPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLIGLOOINTERFACESGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLIGLOOINTERFACESGIXPROC.class, fi, constants$984.PFNGLIGLOOINTERFACESGIXPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLIGLOOINTERFACESGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$984.PFNGLIGLOOINTERFACESGIXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


