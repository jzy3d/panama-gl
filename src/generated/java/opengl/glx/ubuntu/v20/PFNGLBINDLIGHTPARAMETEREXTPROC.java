// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBINDLIGHTPARAMETEREXTPROC {

    int apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBINDLIGHTPARAMETEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDLIGHTPARAMETEREXTPROC.class, fi, constants$776.PFNGLBINDLIGHTPARAMETEREXTPROC$FUNC, "(II)I");
    }
    static MemoryAddress allocate(PFNGLBINDLIGHTPARAMETEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDLIGHTPARAMETEREXTPROC.class, fi, constants$776.PFNGLBINDLIGHTPARAMETEREXTPROC$FUNC, "(II)I", scope);
    }
    static PFNGLBINDLIGHTPARAMETEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (int)constants$776.PFNGLBINDLIGHTPARAMETEREXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


