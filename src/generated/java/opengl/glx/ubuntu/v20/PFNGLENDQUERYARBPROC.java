// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLENDQUERYARBPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLENDQUERYARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLENDQUERYARBPROC.class, fi, constants$432.PFNGLENDQUERYARBPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLENDQUERYARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLENDQUERYARBPROC.class, fi, constants$432.PFNGLENDQUERYARBPROC$FUNC, "(I)V", scope);
    }
    static PFNGLENDQUERYARBPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$432.PFNGLENDQUERYARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


