// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXPARAMETERXOESPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLTEXPARAMETERXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXPARAMETERXOESPROC.class, fi, constants$424.PFNGLTEXPARAMETERXOESPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLTEXPARAMETERXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXPARAMETERXOESPROC.class, fi, constants$424.PFNGLTEXPARAMETERXOESPROC$FUNC, "(III)V", scope);
    }
    static PFNGLTEXPARAMETERXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$424.PFNGLTEXPARAMETERXOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


