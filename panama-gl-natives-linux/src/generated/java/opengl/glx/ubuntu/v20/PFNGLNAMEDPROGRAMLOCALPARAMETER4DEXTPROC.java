// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC {

    void apply(int x0, int x1, int x2, double x3, double x4, double x5, double x6);
    static MemoryAddress allocate(PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC.class, fi, constants$677.PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC$FUNC, "(IIIDDDD)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC.class, fi, constants$677.PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC$FUNC, "(IIIDDDD)V", scope);
    }
    static PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, double x3, double x4, double x5, double x6) -> {
            try {
                constants$677.PFNGLNAMEDPROGRAMLOCALPARAMETER4DEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


