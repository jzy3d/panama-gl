// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETUNIFORMBUFFERSIZEEXTPROC {

    int apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLGETUNIFORMBUFFERSIZEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMBUFFERSIZEEXTPROC.class, fi, constants$516.PFNGLGETUNIFORMBUFFERSIZEEXTPROC$FUNC, "(II)I");
    }
    static MemoryAddress allocate(PFNGLGETUNIFORMBUFFERSIZEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMBUFFERSIZEEXTPROC.class, fi, constants$516.PFNGLGETUNIFORMBUFFERSIZEEXTPROC$FUNC, "(II)I", scope);
    }
    static PFNGLGETUNIFORMBUFFERSIZEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (int)constants$516.PFNGLGETUNIFORMBUFFERSIZEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

