// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDELETEFRAGMENTSHADERATIPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLDELETEFRAGMENTSHADERATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETEFRAGMENTSHADERATIPROC.class, fi, constants$489.PFNGLDELETEFRAGMENTSHADERATIPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLDELETEFRAGMENTSHADERATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETEFRAGMENTSHADERATIPROC.class, fi, constants$489.PFNGLDELETEFRAGMENTSHADERATIPROC$FUNC, "(I)V", scope);
    }
    static PFNGLDELETEFRAGMENTSHADERATIPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$489.PFNGLDELETEFRAGMENTSHADERATIPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

