// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMULTITEXGENFEXTPROC {

    void apply(int x0, int x1, int x2, float x3);
    static MemoryAddress allocate(PFNGLMULTITEXGENFEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXGENFEXTPROC.class, fi, constants$551.PFNGLMULTITEXGENFEXTPROC$FUNC, "(IIIF)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXGENFEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXGENFEXTPROC.class, fi, constants$551.PFNGLMULTITEXGENFEXTPROC$FUNC, "(IIIF)V", scope);
    }
    static PFNGLMULTITEXGENFEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, float x3) -> {
            try {
                constants$551.PFNGLMULTITEXGENFEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


