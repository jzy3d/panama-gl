// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDRAWARRAYSINSTANCEDEXTPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLDRAWARRAYSINSTANCEDEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWARRAYSINSTANCEDEXTPROC.class, fi, constants$706.PFNGLDRAWARRAYSINSTANCEDEXTPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLDRAWARRAYSINSTANCEDEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWARRAYSINSTANCEDEXTPROC.class, fi, constants$706.PFNGLDRAWARRAYSINSTANCEDEXTPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLDRAWARRAYSINSTANCEDEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$706.PFNGLDRAWARRAYSINSTANCEDEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

