// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC.class, fi, constants$368.PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC.class, fi, constants$368.PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$368.PFNGLGETNAMEDFRAMEBUFFERPARAMETERIVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


