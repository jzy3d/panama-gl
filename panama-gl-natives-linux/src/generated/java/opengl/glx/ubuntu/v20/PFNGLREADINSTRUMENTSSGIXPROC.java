// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLREADINSTRUMENTSSGIXPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLREADINSTRUMENTSSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLREADINSTRUMENTSSGIXPROC.class, fi, constants$986.PFNGLREADINSTRUMENTSSGIXPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLREADINSTRUMENTSSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLREADINSTRUMENTSSGIXPROC.class, fi, constants$986.PFNGLREADINSTRUMENTSSGIXPROC$FUNC, "(I)V", scope);
    }
    static PFNGLREADINSTRUMENTSSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$986.PFNGLREADINSTRUMENTSSGIXPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


