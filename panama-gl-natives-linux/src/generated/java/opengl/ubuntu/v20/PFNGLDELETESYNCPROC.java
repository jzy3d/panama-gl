// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDELETESYNCPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLDELETESYNCPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETESYNCPROC.class, fi, constants$180.PFNGLDELETESYNCPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETESYNCPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETESYNCPROC.class, fi, constants$180.PFNGLDELETESYNCPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETESYNCPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$180.PFNGLDELETESYNCPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


