// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, int x5, int x6, int x7, jdk.incubator.foreign.MemoryAddress x8);
    static MemoryAddress allocate(PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROC.class, fi, constants$888.PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;IIIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROC.class, fi, constants$888.PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;IIIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, int x5, int x6, int x7, jdk.incubator.foreign.MemoryAddress x8) -> {
            try {
                constants$888.PFNGLSTENCILTHENCOVERSTROKEPATHINSTANCEDNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7, x8);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


