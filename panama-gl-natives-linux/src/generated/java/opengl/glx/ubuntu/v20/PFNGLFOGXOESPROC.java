// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLFOGXOESPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLFOGXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFOGXOESPROC.class, fi, constants$501.PFNGLFOGXOESPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLFOGXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFOGXOESPROC.class, fi, constants$501.PFNGLFOGXOESPROC$FUNC, "(II)V", scope);
    }
    static PFNGLFOGXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$501.PFNGLFOGXOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

