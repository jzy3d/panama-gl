// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFRAGMENTLIGHTFSGIXPROC {

    void apply(int x0, int x1, float x2);
    static MemoryAddress allocate(PFNGLFRAGMENTLIGHTFSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTLIGHTFSGIXPROC.class, fi, constants$893.PFNGLFRAGMENTLIGHTFSGIXPROC$FUNC, "(IIF)V");
    }
    static MemoryAddress allocate(PFNGLFRAGMENTLIGHTFSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTLIGHTFSGIXPROC.class, fi, constants$893.PFNGLFRAGMENTLIGHTFSGIXPROC$FUNC, "(IIF)V", scope);
    }
    static PFNGLFRAGMENTLIGHTFSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, float x2) -> {
            try {
                constants$893.PFNGLFRAGMENTLIGHTFSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


