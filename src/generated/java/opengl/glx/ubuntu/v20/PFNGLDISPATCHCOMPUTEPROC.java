// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDISPATCHCOMPUTEPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLDISPATCHCOMPUTEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDISPATCHCOMPUTEPROC.class, fi, constants$339.PFNGLDISPATCHCOMPUTEPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLDISPATCHCOMPUTEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDISPATCHCOMPUTEPROC.class, fi, constants$339.PFNGLDISPATCHCOMPUTEPROC$FUNC, "(III)V", scope);
    }
    static PFNGLDISPATCHCOMPUTEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$339.PFNGLDISPATCHCOMPUTEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


