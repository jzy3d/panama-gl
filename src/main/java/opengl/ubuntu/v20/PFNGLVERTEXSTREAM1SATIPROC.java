// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXSTREAM1SATIPROC {

    void apply(int x0, short x1);
    static MemoryAddress allocate(PFNGLVERTEXSTREAM1SATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM1SATIPROC.class, fi, constants$500.PFNGLVERTEXSTREAM1SATIPROC$FUNC, "(IS)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXSTREAM1SATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM1SATIPROC.class, fi, constants$500.PFNGLVERTEXSTREAM1SATIPROC$FUNC, "(IS)V", scope);
    }
    static PFNGLVERTEXSTREAM1SATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, short x1) -> {
            try {
                constants$500.PFNGLVERTEXSTREAM1SATIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


