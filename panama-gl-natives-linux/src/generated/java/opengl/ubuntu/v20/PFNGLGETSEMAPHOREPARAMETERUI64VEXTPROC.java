// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC.class, fi, constants$661.PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC.class, fi, constants$661.PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$661.PFNGLGETSEMAPHOREPARAMETERUI64VEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

