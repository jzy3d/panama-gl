// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDEFORMATIONMAP3DSGIXPROC {

    void apply(int x0, double x1, double x2, int x3, int x4, double x5, double x6, int x7, int x8, double x9, double x10, int x11, int x12, jdk.incubator.foreign.MemoryAddress x13);
    static MemoryAddress allocate(PFNGLDEFORMATIONMAP3DSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDEFORMATIONMAP3DSGIXPROC.class, fi, constants$904.PFNGLDEFORMATIONMAP3DSGIXPROC$FUNC, "(IDDIIDDIIDDIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDEFORMATIONMAP3DSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDEFORMATIONMAP3DSGIXPROC.class, fi, constants$904.PFNGLDEFORMATIONMAP3DSGIXPROC$FUNC, "(IDDIIDDIIDDIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDEFORMATIONMAP3DSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, double x1, double x2, int x3, int x4, double x5, double x6, int x7, int x8, double x9, double x10, int x11, int x12, jdk.incubator.foreign.MemoryAddress x13) -> {
            try {
                constants$904.PFNGLDEFORMATIONMAP3DSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


