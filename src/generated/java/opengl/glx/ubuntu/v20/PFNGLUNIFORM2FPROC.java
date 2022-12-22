// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLUNIFORM2FPROC {

    void apply(int x0, float x1, float x2);
    static MemoryAddress allocate(PFNGLUNIFORM2FPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2FPROC.class, fi, constants$211.PFNGLUNIFORM2FPROC$FUNC, "(IFF)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM2FPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM2FPROC.class, fi, constants$211.PFNGLUNIFORM2FPROC$FUNC, "(IFF)V", scope);
    }
    static PFNGLUNIFORM2FPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2) -> {
            try {
                constants$211.PFNGLUNIFORM2FPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


