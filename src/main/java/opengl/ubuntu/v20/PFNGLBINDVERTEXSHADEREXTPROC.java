// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBINDVERTEXSHADEREXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLBINDVERTEXSHADEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDVERTEXSHADEREXTPROC.class, fi, constants$682.PFNGLBINDVERTEXSHADEREXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLBINDVERTEXSHADEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDVERTEXSHADEREXTPROC.class, fi, constants$682.PFNGLBINDVERTEXSHADEREXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLBINDVERTEXSHADEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$682.PFNGLBINDVERTEXSHADEREXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


