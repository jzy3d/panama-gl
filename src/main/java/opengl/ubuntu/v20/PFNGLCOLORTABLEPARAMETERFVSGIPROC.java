// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCOLORTABLEPARAMETERFVSGIPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLCOLORTABLEPARAMETERFVSGIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCOLORTABLEPARAMETERFVSGIPROC.class, fi, constants$907.PFNGLCOLORTABLEPARAMETERFVSGIPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLCOLORTABLEPARAMETERFVSGIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCOLORTABLEPARAMETERFVSGIPROC.class, fi, constants$907.PFNGLCOLORTABLEPARAMETERFVSGIPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLCOLORTABLEPARAMETERFVSGIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$907.PFNGLCOLORTABLEPARAMETERFVSGIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

