// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC {

    void apply(int x0, int x1, int x2, int x3, int x4, jdk.incubator.foreign.MemoryAddress x5, int x6);
    static MemoryAddress allocate(PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC.class, fi, constants$178.PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC$FUNC, "(IIIIILjdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC.class, fi, constants$178.PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC$FUNC, "(IIIIILjdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3, int x4, jdk.incubator.foreign.MemoryAddress x5, int x6) -> {
            try {
                constants$178.PFNGLDRAWRANGEELEMENTSBASEVERTEXPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

