// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETPERFQUERYDATAINTELPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFNGLGETPERFQUERYDATAINTELPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPERFQUERYDATAINTELPROC.class, fi, constants$710.PFNGLGETPERFQUERYDATAINTELPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPERFQUERYDATAINTELPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPERFQUERYDATAINTELPROC.class, fi, constants$710.PFNGLGETPERFQUERYDATAINTELPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPERFQUERYDATAINTELPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                constants$710.PFNGLGETPERFQUERYDATAINTELPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

