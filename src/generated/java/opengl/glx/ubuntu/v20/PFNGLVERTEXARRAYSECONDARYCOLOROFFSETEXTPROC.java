// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, long x5);
    static MemoryAddress allocate(PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC.class, fi, constants$689.PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC$FUNC, "(IIIIIJ)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC.class, fi, constants$689.PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC$FUNC, "(IIIIIJ)V", scope);
    }
    static PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, long x5) -> {
            try {
                constants$689.PFNGLVERTEXARRAYSECONDARYCOLOROFFSETEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


