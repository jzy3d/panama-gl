// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBINDBUFFERRANGEPROC {

    void apply(int x0, int x1, int x2, long x3, long x4);
    static MemoryAddress allocate(PFNGLBINDBUFFERRANGEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFERRANGEPROC.class, fi, constants$149.PFNGLBINDBUFFERRANGEPROC$FUNC, "(IIIJJ)V");
    }
    static MemoryAddress allocate(PFNGLBINDBUFFERRANGEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDBUFFERRANGEPROC.class, fi, constants$149.PFNGLBINDBUFFERRANGEPROC$FUNC, "(IIIJJ)V", scope);
    }
    static PFNGLBINDBUFFERRANGEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, long x3, long x4) -> {
            try {
                constants$149.PFNGLBINDBUFFERRANGEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


