// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMAPVERTEXATTRIB1FAPPLEPROC {

    void apply(int x0, int x1, float x2, float x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6);
    static MemoryAddress allocate(PFNGLMAPVERTEXATTRIB1FAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAPVERTEXATTRIB1FAPPLEPROC.class, fi, constants$485.PFNGLMAPVERTEXATTRIB1FAPPLEPROC$FUNC, "(IIFFIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLMAPVERTEXATTRIB1FAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAPVERTEXATTRIB1FAPPLEPROC.class, fi, constants$485.PFNGLMAPVERTEXATTRIB1FAPPLEPROC$FUNC, "(IIFFIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLMAPVERTEXATTRIB1FAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, float x2, float x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6) -> {
            try {
                constants$485.PFNGLMAPVERTEXATTRIB1FAPPLEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

