// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLISENABLEDINDEXEDEXTPROC {

    byte apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLISENABLEDINDEXEDEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISENABLEDINDEXEDEXTPROC.class, fi, constants$648.PFNGLISENABLEDINDEXEDEXTPROC$FUNC, "(II)B");
    }
    static MemoryAddress allocate(PFNGLISENABLEDINDEXEDEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISENABLEDINDEXEDEXTPROC.class, fi, constants$648.PFNGLISENABLEDINDEXEDEXTPROC$FUNC, "(II)B", scope);
    }
    static PFNGLISENABLEDINDEXEDEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (byte)constants$648.PFNGLISENABLEDINDEXEDEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


