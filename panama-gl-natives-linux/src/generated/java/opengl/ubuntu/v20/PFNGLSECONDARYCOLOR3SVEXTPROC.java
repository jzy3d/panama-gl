// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSECONDARYCOLOR3SVEXTPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3SVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3SVEXTPROC.class, fi, constants$657.PFNGLSECONDARYCOLOR3SVEXTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3SVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3SVEXTPROC.class, fi, constants$657.PFNGLSECONDARYCOLOR3SVEXTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLSECONDARYCOLOR3SVEXTPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$657.PFNGLSECONDARYCOLOR3SVEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


