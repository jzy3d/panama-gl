// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETBUFFERPARAMETERUI64VNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETBUFFERPARAMETERUI64VNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETBUFFERPARAMETERUI64VNVPROC.class, fi, constants$821.PFNGLGETBUFFERPARAMETERUI64VNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETBUFFERPARAMETERUI64VNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETBUFFERPARAMETERUI64VNVPROC.class, fi, constants$821.PFNGLGETBUFFERPARAMETERUI64VNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETBUFFERPARAMETERUI64VNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$821.PFNGLGETBUFFERPARAMETERUI64VNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


