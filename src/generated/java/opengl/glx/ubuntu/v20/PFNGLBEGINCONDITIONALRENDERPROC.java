// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBEGINCONDITIONALRENDERPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBEGINCONDITIONALRENDERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBEGINCONDITIONALRENDERPROC.class, fi, constants$236.PFNGLBEGINCONDITIONALRENDERPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBEGINCONDITIONALRENDERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBEGINCONDITIONALRENDERPROC.class, fi, constants$236.PFNGLBEGINCONDITIONALRENDERPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBEGINCONDITIONALRENDERPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$236.PFNGLBEGINCONDITIONALRENDERPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


