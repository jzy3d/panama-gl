// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFRAGMENTMATERIALFSGIXPROC {

    void apply(int x0, int x1, float x2);
    static MemoryAddress allocate(PFNGLFRAGMENTMATERIALFSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTMATERIALFSGIXPROC.class, fi, constants$981.PFNGLFRAGMENTMATERIALFSGIXPROC$FUNC, "(IIF)V");
    }
    static MemoryAddress allocate(PFNGLFRAGMENTMATERIALFSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTMATERIALFSGIXPROC.class, fi, constants$981.PFNGLFRAGMENTMATERIALFSGIXPROC$FUNC, "(IIF)V", scope);
    }
    static PFNGLFRAGMENTMATERIALFSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, float x2) -> {
            try {
                constants$981.PFNGLFRAGMENTMATERIALFSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


