// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3, int x4, jdk.incubator.foreign.MemoryAddress x5);
    static MemoryAddress allocate(PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC.class, fi, constants$179.PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC.class, fi, constants$179.PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3, int x4, jdk.incubator.foreign.MemoryAddress x5) -> {
            try {
                constants$179.PFNGLMULTIDRAWELEMENTSBASEVERTEXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


