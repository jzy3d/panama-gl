// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBINDTEXGENPARAMETEREXTPROC {

    int apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLBINDTEXGENPARAMETEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDTEXGENPARAMETEREXTPROC.class, fi, constants$691.PFNGLBINDTEXGENPARAMETEREXTPROC$FUNC, "(III)I");
    }
    static MemoryAddress allocate(PFNGLBINDTEXGENPARAMETEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDTEXGENPARAMETEREXTPROC.class, fi, constants$691.PFNGLBINDTEXGENPARAMETEREXTPROC$FUNC, "(III)I", scope);
    }
    static PFNGLBINDTEXGENPARAMETEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                return (int)constants$691.PFNGLBINDTEXGENPARAMETEREXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


