// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDELETEPROGRAMPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLDELETEPROGRAMPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETEPROGRAMPROC.class, fi, constants$202.PFNGLDELETEPROGRAMPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLDELETEPROGRAMPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETEPROGRAMPROC.class, fi, constants$202.PFNGLDELETEPROGRAMPROC$FUNC, "(I)V", scope);
    }
    static PFNGLDELETEPROGRAMPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$202.PFNGLDELETEPROGRAMPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


