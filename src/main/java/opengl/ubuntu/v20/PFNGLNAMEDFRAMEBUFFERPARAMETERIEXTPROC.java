// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROC.class, fi, constants$609.PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROC.class, fi, constants$609.PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROC$FUNC, "(III)V", scope);
    }
    static PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$609.PFNGLNAMEDFRAMEBUFFERPARAMETERIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

