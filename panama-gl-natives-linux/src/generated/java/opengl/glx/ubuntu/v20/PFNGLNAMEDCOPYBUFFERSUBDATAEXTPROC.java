// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC {

    void apply(int x0, int x1, long x2, long x3, long x4);
    static MemoryAddress allocate(PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC.class, fi, constants$685.PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC$FUNC, "(IIJJJ)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC.class, fi, constants$685.PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC$FUNC, "(IIJJJ)V", scope);
    }
    static PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, long x2, long x3, long x4) -> {
            try {
                constants$685.PFNGLNAMEDCOPYBUFFERSUBDATAEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


