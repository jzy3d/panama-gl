// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLFRAGMENTMATERIALISGIXPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLFRAGMENTMATERIALISGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTMATERIALISGIXPROC.class, fi, constants$896.PFNGLFRAGMENTMATERIALISGIXPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLFRAGMENTMATERIALISGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAGMENTMATERIALISGIXPROC.class, fi, constants$896.PFNGLFRAGMENTMATERIALISGIXPROC$FUNC, "(III)V", scope);
    }
    static PFNGLFRAGMENTMATERIALISGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$896.PFNGLFRAGMENTMATERIALISGIXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

