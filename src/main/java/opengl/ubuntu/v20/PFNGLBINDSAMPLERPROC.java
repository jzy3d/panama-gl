// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBINDSAMPLERPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBINDSAMPLERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDSAMPLERPROC.class, fi, constants$186.PFNGLBINDSAMPLERPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBINDSAMPLERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDSAMPLERPROC.class, fi, constants$186.PFNGLBINDSAMPLERPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBINDSAMPLERPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$186.PFNGLBINDSAMPLERPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

