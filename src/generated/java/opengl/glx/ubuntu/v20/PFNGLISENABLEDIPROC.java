// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLISENABLEDIPROC {

    byte apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLISENABLEDIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISENABLEDIPROC.class, fi, constants$233.PFNGLISENABLEDIPROC$FUNC, "(II)B");
    }
    static MemoryAddress allocate(PFNGLISENABLEDIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISENABLEDIPROC.class, fi, constants$233.PFNGLISENABLEDIPROC$FUNC, "(II)B", scope);
    }
    static PFNGLISENABLEDIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (byte)constants$233.PFNGLISENABLEDIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


