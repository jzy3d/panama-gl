// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLUNIFORM2IPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLUNIFORM2IPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2IPROC.class, fi, constants$212.PFNGLUNIFORM2IPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM2IPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2IPROC.class, fi, constants$212.PFNGLUNIFORM2IPROC$FUNC, "(III)V", scope);
    }
    static PFNGLUNIFORM2IPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$212.PFNGLUNIFORM2IPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


