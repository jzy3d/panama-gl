// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETTEXPARAMETERIIVEXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETTEXPARAMETERIIVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXPARAMETERIIVEXTPROC.class, fi, constants$754.PFNGLGETTEXPARAMETERIIVEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETTEXPARAMETERIIVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXPARAMETERIIVEXTPROC.class, fi, constants$754.PFNGLGETTEXPARAMETERIIVEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETTEXPARAMETERIIVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$754.PFNGLGETTEXPARAMETERIIVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


