// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEXWEIGHTFEXTPROC {

    void apply(float x0);
    static MemoryAddress allocate(PFNGLVERTEXWEIGHTFEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXWEIGHTFEXTPROC.class, fi, constants$696.PFNGLVERTEXWEIGHTFEXTPROC$FUNC, "(F)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXWEIGHTFEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXWEIGHTFEXTPROC.class, fi, constants$696.PFNGLVERTEXWEIGHTFEXTPROC$FUNC, "(F)V", scope);
    }
    static PFNGLVERTEXWEIGHTFEXTPROC ofAddress(MemoryAddress addr) {
        return (float x0) -> {
            try {
                constants$696.PFNGLVERTEXWEIGHTFEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


