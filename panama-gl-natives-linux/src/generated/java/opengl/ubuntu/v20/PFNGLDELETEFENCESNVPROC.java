// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDELETEFENCESNVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDELETEFENCESNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETEFENCESNVPROC.class, fi, constants$747.PFNGLDELETEFENCESNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETEFENCESNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETEFENCESNVPROC.class, fi, constants$747.PFNGLDELETEFENCESNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETEFENCESNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$747.PFNGLDELETEFENCESNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


