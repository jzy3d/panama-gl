// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDELETEFENCESAPPLEPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDELETEFENCESAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETEFENCESAPPLEPROC.class, fi, constants$562.PFNGLDELETEFENCESAPPLEPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETEFENCESAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETEFENCESAPPLEPROC.class, fi, constants$562.PFNGLDELETEFENCESAPPLEPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETEFENCESAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$562.PFNGLDELETEFENCESAPPLEPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


