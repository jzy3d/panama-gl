// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLFRAGMENTLIGHTMODELFSGIXPROC {

    void apply(int x0, float x1);
    static MemoryAddress allocate(PFNGLFRAGMENTLIGHTMODELFSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTLIGHTMODELFSGIXPROC.class, fi, constants$894.PFNGLFRAGMENTLIGHTMODELFSGIXPROC$FUNC, "(IF)V");
    }
    static MemoryAddress allocate(PFNGLFRAGMENTLIGHTMODELFSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTLIGHTMODELFSGIXPROC.class, fi, constants$894.PFNGLFRAGMENTLIGHTMODELFSGIXPROC$FUNC, "(IF)V", scope);
    }
    static PFNGLFRAGMENTLIGHTMODELFSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1) -> {
            try {
                constants$894.PFNGLFRAGMENTLIGHTMODELFSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

