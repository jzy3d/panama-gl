// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMULTIMODEDRAWELEMENTSIBMPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3, int x4, int x5);
    static MemoryAddress allocate(PFNGLMULTIMODEDRAWELEMENTSIBMPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTIMODEDRAWELEMENTSIBMPROC.class, fi, constants$701.PFNGLMULTIMODEDRAWELEMENTSIBMPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;II)V");
    }
    static MemoryAddress allocate(PFNGLMULTIMODEDRAWELEMENTSIBMPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTIMODEDRAWELEMENTSIBMPROC.class, fi, constants$701.PFNGLMULTIMODEDRAWELEMENTSIBMPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;II)V", scope);
    }
    static PFNGLMULTIMODEDRAWELEMENTSIBMPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3, int x4, int x5) -> {
            try {
                constants$701.PFNGLMULTIMODEDRAWELEMENTSIBMPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


