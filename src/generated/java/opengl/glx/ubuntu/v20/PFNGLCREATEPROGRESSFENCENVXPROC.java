// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLCREATEPROGRESSFENCENVXPROC {

    int apply();
    static MemoryAddress allocate(PFNGLCREATEPROGRESSFENCENVXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCREATEPROGRESSFENCENVXPROC.class, fi, constants$809.PFNGLCREATEPROGRESSFENCENVXPROC$FUNC, "()I");
    }
    static MemoryAddress allocate(PFNGLCREATEPROGRESSFENCENVXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCREATEPROGRESSFENCENVXPROC.class, fi, constants$809.PFNGLCREATEPROGRESSFENCENVXPROC$FUNC, "()I", scope);
    }
    static PFNGLCREATEPROGRESSFENCENVXPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                return (int)constants$809.PFNGLCREATEPROGRESSFENCENVXPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


