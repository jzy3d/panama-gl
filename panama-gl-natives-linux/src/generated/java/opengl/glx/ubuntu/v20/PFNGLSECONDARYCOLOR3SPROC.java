// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSECONDARYCOLOR3SPROC {

    void apply(short x0, short x1, short x2);
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3SPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3SPROC.class, fi, constants$183.PFNGLSECONDARYCOLOR3SPROC$FUNC, "(SSS)V");
    }
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3SPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3SPROC.class, fi, constants$183.PFNGLSECONDARYCOLOR3SPROC$FUNC, "(SSS)V", scope);
    }
    static PFNGLSECONDARYCOLOR3SPROC ofAddress(MemoryAddress addr) {
        return (short x0, short x1, short x2) -> {
            try {
                constants$183.PFNGLSECONDARYCOLOR3SPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


