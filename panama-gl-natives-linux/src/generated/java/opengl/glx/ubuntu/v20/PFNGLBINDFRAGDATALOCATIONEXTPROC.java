// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBINDFRAGDATALOCATIONEXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLBINDFRAGDATALOCATIONEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDFRAGDATALOCATIONEXTPROC.class, fi, constants$717.PFNGLBINDFRAGDATALOCATIONEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLBINDFRAGDATALOCATIONEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDFRAGDATALOCATIONEXTPROC.class, fi, constants$717.PFNGLBINDFRAGDATALOCATIONEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLBINDFRAGDATALOCATIONEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$717.PFNGLBINDFRAGDATALOCATIONEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


