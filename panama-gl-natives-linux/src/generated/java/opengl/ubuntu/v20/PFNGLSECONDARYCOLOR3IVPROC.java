// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSECONDARYCOLOR3IVPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3IVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3IVPROC.class, fi, constants$97.PFNGLSECONDARYCOLOR3IVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3IVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3IVPROC.class, fi, constants$97.PFNGLSECONDARYCOLOR3IVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLSECONDARYCOLOR3IVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$97.PFNGLSECONDARYCOLOR3IVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

