// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFRAGMENTMATERIALFVSGIXPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLFRAGMENTMATERIALFVSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTMATERIALFVSGIXPROC.class, fi, constants$981.PFNGLFRAGMENTMATERIALFVSGIXPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLFRAGMENTMATERIALFVSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTMATERIALFVSGIXPROC.class, fi, constants$981.PFNGLFRAGMENTMATERIALFVSGIXPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLFRAGMENTMATERIALFVSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$981.PFNGLFRAGMENTMATERIALFVSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


