// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCREATESHADERPROGRAMVPROC {

    int apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLCREATESHADERPROGRAMVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCREATESHADERPROGRAMVPROC.class, fi, constants$222.PFNGLCREATESHADERPROGRAMVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLCREATESHADERPROGRAMVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCREATESHADERPROGRAMVPROC.class, fi, constants$222.PFNGLCREATESHADERPROGRAMVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLCREATESHADERPROGRAMVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                return (int)constants$222.PFNGLCREATESHADERPROGRAMVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

