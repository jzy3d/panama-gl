// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFOGCOORDDPROC {

    void apply(double x0);
    static MemoryAddress allocate(PFNGLFOGCOORDDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFOGCOORDDPROC.class, fi, constants$179.PFNGLFOGCOORDDPROC$FUNC, "(D)V");
    }
    static MemoryAddress allocate(PFNGLFOGCOORDDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFOGCOORDDPROC.class, fi, constants$179.PFNGLFOGCOORDDPROC$FUNC, "(D)V", scope);
    }
    static PFNGLFOGCOORDDPROC ofAddress(MemoryAddress addr) {
        return (double x0) -> {
            try {
                constants$179.PFNGLFOGCOORDDPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


