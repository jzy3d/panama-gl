// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLMATRIXMULTTRANSPOSEDEXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLMATRIXMULTTRANSPOSEDEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXMULTTRANSPOSEDEXTPROC.class, fi, constants$569.PFNGLMATRIXMULTTRANSPOSEDEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLMATRIXMULTTRANSPOSEDEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMATRIXMULTTRANSPOSEDEXTPROC.class, fi, constants$569.PFNGLMATRIXMULTTRANSPOSEDEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLMATRIXMULTTRANSPOSEDEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$569.PFNGLMATRIXMULTTRANSPOSEDEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


