// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDEPTHRANGEINDEXEDPROC {

    void apply(int x0, double x1, double x2);
    static MemoryAddress allocate(PFNGLDEPTHRANGEINDEXEDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDEPTHRANGEINDEXEDPROC.class, fi, constants$333.PFNGLDEPTHRANGEINDEXEDPROC$FUNC, "(IDD)V");
    }
    static MemoryAddress allocate(PFNGLDEPTHRANGEINDEXEDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDEPTHRANGEINDEXEDPROC.class, fi, constants$333.PFNGLDEPTHRANGEINDEXEDPROC$FUNC, "(IDD)V", scope);
    }
    static PFNGLDEPTHRANGEINDEXEDPROC ofAddress(MemoryAddress addr) {
        return (int x0, double x1, double x2) -> {
            try {
                constants$333.PFNGLDEPTHRANGEINDEXEDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


