// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDRAWMESHTASKSNVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLDRAWMESHTASKSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWMESHTASKSNVPROC.class, fi, constants$781.PFNGLDRAWMESHTASKSNVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLDRAWMESHTASKSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWMESHTASKSNVPROC.class, fi, constants$781.PFNGLDRAWMESHTASKSNVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLDRAWMESHTASKSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$781.PFNGLDRAWMESHTASKSNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


