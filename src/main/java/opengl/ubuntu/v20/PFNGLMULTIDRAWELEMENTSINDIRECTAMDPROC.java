// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC.class, fi, constants$467.PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;II)V");
    }
    static MemoryAddress allocate(PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC.class, fi, constants$467.PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;II)V", scope);
    }
    static PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4) -> {
            try {
                constants$467.PFNGLMULTIDRAWELEMENTSINDIRECTAMDPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


