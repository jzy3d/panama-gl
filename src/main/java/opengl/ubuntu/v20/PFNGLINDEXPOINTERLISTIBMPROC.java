// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLINDEXPOINTERLISTIBMPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3);
    static MemoryAddress allocate(PFNGLINDEXPOINTERLISTIBMPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLINDEXPOINTERLISTIBMPROC.class, fi, constants$703.PFNGLINDEXPOINTERLISTIBMPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLINDEXPOINTERLISTIBMPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLINDEXPOINTERLISTIBMPROC.class, fi, constants$703.PFNGLINDEXPOINTERLISTIBMPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLINDEXPOINTERLISTIBMPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3) -> {
            try {
                constants$703.PFNGLINDEXPOINTERLISTIBMPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

