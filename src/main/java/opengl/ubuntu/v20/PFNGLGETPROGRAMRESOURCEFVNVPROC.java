// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETPROGRAMRESOURCEFVNVPROC {

    void apply(int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4, int x5, jdk.incubator.foreign.MemoryAddress x6, jdk.incubator.foreign.MemoryAddress x7);
    static MemoryAddress allocate(PFNGLGETPROGRAMRESOURCEFVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMRESOURCEFVNVPROC.class, fi, constants$805.PFNGLGETPROGRAMRESOURCEFVNVPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPROGRAMRESOURCEFVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMRESOURCEFVNVPROC.class, fi, constants$805.PFNGLGETPROGRAMRESOURCEFVNVPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPROGRAMRESOURCEFVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4, int x5, jdk.incubator.foreign.MemoryAddress x6, jdk.incubator.foreign.MemoryAddress x7) -> {
            try {
                constants$805.PFNGLGETPROGRAMRESOURCEFVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


