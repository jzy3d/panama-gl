// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGENERATEMIPMAPEXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLGENERATEMIPMAPEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENERATEMIPMAPEXTPROC.class, fi, constants$630.PFNGLGENERATEMIPMAPEXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLGENERATEMIPMAPEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENERATEMIPMAPEXTPROC.class, fi, constants$630.PFNGLGENERATEMIPMAPEXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLGENERATEMIPMAPEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$630.PFNGLGENERATEMIPMAPEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


