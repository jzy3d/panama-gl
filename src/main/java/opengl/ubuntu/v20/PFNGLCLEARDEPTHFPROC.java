// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCLEARDEPTHFPROC {

    void apply(float x0);
    static MemoryAddress allocate(PFNGLCLEARDEPTHFPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCLEARDEPTHFPROC.class, fi, constants$220.PFNGLCLEARDEPTHFPROC$FUNC, "(F)V");
    }
    static MemoryAddress allocate(PFNGLCLEARDEPTHFPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCLEARDEPTHFPROC.class, fi, constants$220.PFNGLCLEARDEPTHFPROC$FUNC, "(F)V", scope);
    }
    static PFNGLCLEARDEPTHFPROC ofAddress(MemoryAddress addr) {
        return (float x0) -> {
            try {
                constants$220.PFNGLCLEARDEPTHFPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


