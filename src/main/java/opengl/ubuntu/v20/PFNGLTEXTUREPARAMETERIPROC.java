// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTEXTUREPARAMETERIPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLTEXTUREPARAMETERIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREPARAMETERIPROC.class, fi, constants$291.PFNGLTEXTUREPARAMETERIPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLTEXTUREPARAMETERIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREPARAMETERIPROC.class, fi, constants$291.PFNGLTEXTUREPARAMETERIPROC$FUNC, "(III)V", scope);
    }
    static PFNGLTEXTUREPARAMETERIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$291.PFNGLTEXTUREPARAMETERIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


