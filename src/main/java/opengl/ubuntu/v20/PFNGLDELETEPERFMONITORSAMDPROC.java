// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDELETEPERFMONITORSAMDPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDELETEPERFMONITORSAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETEPERFMONITORSAMDPROC.class, fi, constants$471.PFNGLDELETEPERFMONITORSAMDPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETEPERFMONITORSAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETEPERFMONITORSAMDPROC.class, fi, constants$471.PFNGLDELETEPERFMONITORSAMDPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETEPERFMONITORSAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$471.PFNGLDELETEPERFMONITORSAMDPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

