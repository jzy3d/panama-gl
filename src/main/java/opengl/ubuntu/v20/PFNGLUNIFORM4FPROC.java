// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLUNIFORM4FPROC {

    void apply(int x0, float x1, float x2, float x3, float x4);
    static MemoryAddress allocate(PFNGLUNIFORM4FPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM4FPROC.class, fi, constants$126.PFNGLUNIFORM4FPROC$FUNC, "(IFFFF)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM4FPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM4FPROC.class, fi, constants$126.PFNGLUNIFORM4FPROC$FUNC, "(IFFFF)V", scope);
    }
    static PFNGLUNIFORM4FPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3, float x4) -> {
            try {
                constants$126.PFNGLUNIFORM4FPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


