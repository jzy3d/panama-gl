// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, long x3, int x4, int x5);
    static MemoryAddress allocate(PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC.class, fi, constants$428.PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;JII)V");
    }
    static MemoryAddress allocate(PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC.class, fi, constants$428.PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;JII)V", scope);
    }
    static PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, long x3, int x4, int x5) -> {
            try {
                constants$428.PFNGLMULTIDRAWELEMENTSINDIRECTCOUNTARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


