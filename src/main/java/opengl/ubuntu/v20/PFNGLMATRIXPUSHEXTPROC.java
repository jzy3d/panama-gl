// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMATRIXPUSHEXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLMATRIXPUSHEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXPUSHEXTPROC.class, fi, constants$540.PFNGLMATRIXPUSHEXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLMATRIXPUSHEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXPUSHEXTPROC.class, fi, constants$540.PFNGLMATRIXPUSHEXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLMATRIXPUSHEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$540.PFNGLMATRIXPUSHEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

