// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLFRAGMENTCOVERAGECOLORNVPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLFRAGMENTCOVERAGECOLORNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTCOVERAGECOLORNVPROC.class, fi, constants$834.PFNGLFRAGMENTCOVERAGECOLORNVPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLFRAGMENTCOVERAGECOLORNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTCOVERAGECOLORNVPROC.class, fi, constants$834.PFNGLFRAGMENTCOVERAGECOLORNVPROC$FUNC, "(I)V", scope);
    }
    static PFNGLFRAGMENTCOVERAGECOLORNVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$834.PFNGLFRAGMENTCOVERAGECOLORNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


