// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMATRIXLOADTRANSPOSEFEXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLMATRIXLOADTRANSPOSEFEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXLOADTRANSPOSEFEXTPROC.class, fi, constants$568.PFNGLMATRIXLOADTRANSPOSEFEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLMATRIXLOADTRANSPOSEFEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXLOADTRANSPOSEFEXTPROC.class, fi, constants$568.PFNGLMATRIXLOADTRANSPOSEFEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLMATRIXLOADTRANSPOSEFEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$568.PFNGLMATRIXLOADTRANSPOSEFEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

