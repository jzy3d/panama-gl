// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXATTRIB3SPROC {

    void apply(int x0, short x1, short x2, short x3);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB3SPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB3SPROC.class, fi, constants$137.PFNGLVERTEXATTRIB3SPROC$FUNC, "(ISSS)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB3SPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB3SPROC.class, fi, constants$137.PFNGLVERTEXATTRIB3SPROC$FUNC, "(ISSS)V", scope);
    }
    static PFNGLVERTEXATTRIB3SPROC ofAddress(MemoryAddress addr) {
        return (int x0, short x1, short x2, short x3) -> {
            try {
                constants$137.PFNGLVERTEXATTRIB3SPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


