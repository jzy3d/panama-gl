// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLINDEXFORMATNVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLINDEXFORMATNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLINDEXFORMATNVPROC.class, fi, constants$932.PFNGLINDEXFORMATNVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLINDEXFORMATNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLINDEXFORMATNVPROC.class, fi, constants$932.PFNGLINDEXFORMATNVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLINDEXFORMATNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$932.PFNGLINDEXFORMATNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


