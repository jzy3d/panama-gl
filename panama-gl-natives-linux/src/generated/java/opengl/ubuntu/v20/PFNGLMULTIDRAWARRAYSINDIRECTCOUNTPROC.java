// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1, long x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC.class, fi, constants$311.PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;JII)V");
    }
    static MemoryAddress allocate(PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC.class, fi, constants$311.PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;JII)V", scope);
    }
    static PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1, long x2, int x3, int x4) -> {
            try {
                constants$311.PFNGLMULTIDRAWARRAYSINDIRECTCOUNTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


