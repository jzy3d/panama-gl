// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLUNIFORM1UIPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLUNIFORM1UIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1UIPROC.class, fi, constants$160.PFNGLUNIFORM1UIPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM1UIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1UIPROC.class, fi, constants$160.PFNGLUNIFORM1UIPROC$FUNC, "(II)V", scope);
    }
    static PFNGLUNIFORM1UIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$160.PFNGLUNIFORM1UIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


