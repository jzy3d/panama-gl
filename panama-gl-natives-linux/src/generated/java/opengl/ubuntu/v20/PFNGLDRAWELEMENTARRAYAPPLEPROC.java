// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDRAWELEMENTARRAYAPPLEPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLDRAWELEMENTARRAYAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWELEMENTARRAYAPPLEPROC.class, fi, constants$475.PFNGLDRAWELEMENTARRAYAPPLEPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLDRAWELEMENTARRAYAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWELEMENTARRAYAPPLEPROC.class, fi, constants$475.PFNGLDRAWELEMENTARRAYAPPLEPROC$FUNC, "(III)V", scope);
    }
    static PFNGLDRAWELEMENTARRAYAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$475.PFNGLDRAWELEMENTARRAYAPPLEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

