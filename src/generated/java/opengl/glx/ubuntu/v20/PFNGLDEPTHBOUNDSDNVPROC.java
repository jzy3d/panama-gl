// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDEPTHBOUNDSDNVPROC {

    void apply(double x0, double x1);
    static MemoryAddress allocate(PFNGLDEPTHBOUNDSDNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDEPTHBOUNDSDNVPROC.class, fi, constants$825.PFNGLDEPTHBOUNDSDNVPROC$FUNC, "(DD)V");
    }
    static MemoryAddress allocate(PFNGLDEPTHBOUNDSDNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDEPTHBOUNDSDNVPROC.class, fi, constants$825.PFNGLDEPTHBOUNDSDNVPROC$FUNC, "(DD)V", scope);
    }
    static PFNGLDEPTHBOUNDSDNVPROC ofAddress(MemoryAddress addr) {
        return (double x0, double x1) -> {
            try {
                constants$825.PFNGLDEPTHBOUNDSDNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


