// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETPROGRAMRESOURCENAMEPROC {

    void apply(int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5);
    static MemoryAddress allocate(PFNGLGETPROGRAMRESOURCENAMEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMRESOURCENAMEPROC.class, fi, constants$259.PFNGLGETPROGRAMRESOURCENAMEPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPROGRAMRESOURCENAMEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMRESOURCENAMEPROC.class, fi, constants$259.PFNGLGETPROGRAMRESOURCENAMEPROC$FUNC, "(IIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPROGRAMRESOURCENAMEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5) -> {
            try {
                constants$259.PFNGLGETPROGRAMRESOURCENAMEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


