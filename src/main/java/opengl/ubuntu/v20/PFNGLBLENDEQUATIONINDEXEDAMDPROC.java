// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBLENDEQUATIONINDEXEDAMDPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBLENDEQUATIONINDEXEDAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONINDEXEDAMDPROC.class, fi, constants$453.PFNGLBLENDEQUATIONINDEXEDAMDPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBLENDEQUATIONINDEXEDAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONINDEXEDAMDPROC.class, fi, constants$453.PFNGLBLENDEQUATIONINDEXEDAMDPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBLENDEQUATIONINDEXEDAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$453.PFNGLBLENDEQUATIONINDEXEDAMDPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


