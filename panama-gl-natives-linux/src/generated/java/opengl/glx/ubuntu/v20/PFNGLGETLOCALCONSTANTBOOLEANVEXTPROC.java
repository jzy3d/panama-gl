// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETLOCALCONSTANTBOOLEANVEXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETLOCALCONSTANTBOOLEANVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETLOCALCONSTANTBOOLEANVEXTPROC.class, fi, constants$780.PFNGLGETLOCALCONSTANTBOOLEANVEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETLOCALCONSTANTBOOLEANVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETLOCALCONSTANTBOOLEANVEXTPROC.class, fi, constants$780.PFNGLGETLOCALCONSTANTBOOLEANVEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETLOCALCONSTANTBOOLEANVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$780.PFNGLGETLOCALCONSTANTBOOLEANVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


