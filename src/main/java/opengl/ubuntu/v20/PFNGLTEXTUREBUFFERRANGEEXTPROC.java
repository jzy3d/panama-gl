// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTEXTUREBUFFERRANGEEXTPROC {

    void apply(int x0, int x1, int x2, int x3, long x4, long x5);
    static MemoryAddress allocate(PFNGLTEXTUREBUFFERRANGEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREBUFFERRANGEEXTPROC.class, fi, constants$616.PFNGLTEXTUREBUFFERRANGEEXTPROC$FUNC, "(IIIIJJ)V");
    }
    static MemoryAddress allocate(PFNGLTEXTUREBUFFERRANGEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREBUFFERRANGEEXTPROC.class, fi, constants$616.PFNGLTEXTUREBUFFERRANGEEXTPROC$FUNC, "(IIIIJJ)V", scope);
    }
    static PFNGLTEXTUREBUFFERRANGEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, long x4, long x5) -> {
            try {
                constants$616.PFNGLTEXTUREBUFFERRANGEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

