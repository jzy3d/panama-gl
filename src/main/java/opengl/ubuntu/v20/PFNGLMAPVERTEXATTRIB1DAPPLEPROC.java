// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMAPVERTEXATTRIB1DAPPLEPROC {

    void apply(int x0, int x1, double x2, double x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6);
    static MemoryAddress allocate(PFNGLMAPVERTEXATTRIB1DAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAPVERTEXATTRIB1DAPPLEPROC.class, fi, constants$485.PFNGLMAPVERTEXATTRIB1DAPPLEPROC$FUNC, "(IIDDIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLMAPVERTEXATTRIB1DAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAPVERTEXATTRIB1DAPPLEPROC.class, fi, constants$485.PFNGLMAPVERTEXATTRIB1DAPPLEPROC$FUNC, "(IIDDIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLMAPVERTEXATTRIB1DAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, double x2, double x3, int x4, int x5, jdk.incubator.foreign.MemoryAddress x6) -> {
            try {
                constants$485.PFNGLMAPVERTEXATTRIB1DAPPLEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

