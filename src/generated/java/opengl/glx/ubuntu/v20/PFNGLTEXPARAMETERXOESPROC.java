// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTEXPARAMETERXOESPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLTEXPARAMETERXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXPARAMETERXOESPROC.class, fi, constants$509.PFNGLTEXPARAMETERXOESPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLTEXPARAMETERXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXPARAMETERXOESPROC.class, fi, constants$509.PFNGLTEXPARAMETERXOESPROC$FUNC, "(III)V", scope);
    }
    static PFNGLTEXPARAMETERXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$509.PFNGLTEXPARAMETERXOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


