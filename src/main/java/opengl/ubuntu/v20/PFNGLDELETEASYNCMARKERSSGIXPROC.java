// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDELETEASYNCMARKERSSGIXPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLDELETEASYNCMARKERSSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETEASYNCMARKERSSGIXPROC.class, fi, constants$892.PFNGLDELETEASYNCMARKERSSGIXPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLDELETEASYNCMARKERSSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETEASYNCMARKERSSGIXPROC.class, fi, constants$892.PFNGLDELETEASYNCMARKERSSGIXPROC$FUNC, "(II)V", scope);
    }
    static PFNGLDELETEASYNCMARKERSSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$892.PFNGLDELETEASYNCMARKERSSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

