// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMATRIXLOADIDENTITYEXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLMATRIXLOADIDENTITYEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXLOADIDENTITYEXTPROC.class, fi, constants$622.PFNGLMATRIXLOADIDENTITYEXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLMATRIXLOADIDENTITYEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXLOADIDENTITYEXTPROC.class, fi, constants$622.PFNGLMATRIXLOADIDENTITYEXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLMATRIXLOADIDENTITYEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$622.PFNGLMATRIXLOADIDENTITYEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


