// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFLUSHRASTERSGIXPROC {

    void apply();
    static MemoryAddress allocate(PFNGLFLUSHRASTERSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFLUSHRASTERSGIXPROC.class, fi, constants$892.PFNGLFLUSHRASTERSGIXPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLFLUSHRASTERSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFLUSHRASTERSGIXPROC.class, fi, constants$892.PFNGLFLUSHRASTERSGIXPROC$FUNC, "()V", scope);
    }
    static PFNGLFLUSHRASTERSGIXPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$892.PFNGLFLUSHRASTERSGIXPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


