// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFRAGMENTLIGHTMODELFSGIXPROC {

    void apply(int x0, float x1);
    static MemoryAddress allocate(PFNGLFRAGMENTLIGHTMODELFSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTLIGHTMODELFSGIXPROC.class, fi, constants$980.PFNGLFRAGMENTLIGHTMODELFSGIXPROC$FUNC, "(IF)V");
    }
    static MemoryAddress allocate(PFNGLFRAGMENTLIGHTMODELFSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTLIGHTMODELFSGIXPROC.class, fi, constants$980.PFNGLFRAGMENTLIGHTMODELFSGIXPROC$FUNC, "(IF)V", scope);
    }
    static PFNGLFRAGMENTLIGHTMODELFSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1) -> {
            try {
                constants$980.PFNGLFRAGMENTLIGHTMODELFSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


