// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLISSTATENVPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISSTATENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISSTATENVPROC.class, fi, constants$818.PFNGLISSTATENVPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISSTATENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISSTATENVPROC.class, fi, constants$818.PFNGLISSTATENVPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISSTATENVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$818.PFNGLISSTATENVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


