// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLUNIFORM1IARBPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLUNIFORM1IARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1IARBPROC.class, fi, constants$448.PFNGLUNIFORM1IARBPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM1IARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1IARBPROC.class, fi, constants$448.PFNGLUNIFORM1IARBPROC$FUNC, "(II)V", scope);
    }
    static PFNGLUNIFORM1IARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$448.PFNGLUNIFORM1IARBPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


