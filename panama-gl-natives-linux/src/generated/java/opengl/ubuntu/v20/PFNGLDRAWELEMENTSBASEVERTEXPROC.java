// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDRAWELEMENTSBASEVERTEXPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, int x4);
    static MemoryAddress allocate(PFNGLDRAWELEMENTSBASEVERTEXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWELEMENTSBASEVERTEXPROC.class, fi, constants$178.PFNGLDRAWELEMENTSBASEVERTEXPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLDRAWELEMENTSBASEVERTEXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWELEMENTSBASEVERTEXPROC.class, fi, constants$178.PFNGLDRAWELEMENTSBASEVERTEXPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLDRAWELEMENTSBASEVERTEXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, int x4) -> {
            try {
                constants$178.PFNGLDRAWELEMENTSBASEVERTEXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


