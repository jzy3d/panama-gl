// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSAMPLERPARAMETERIIVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLSAMPLERPARAMETERIIVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSAMPLERPARAMETERIIVPROC.class, fi, constants$273.PFNGLSAMPLERPARAMETERIIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLSAMPLERPARAMETERIIVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSAMPLERPARAMETERIIVPROC.class, fi, constants$273.PFNGLSAMPLERPARAMETERIIVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLSAMPLERPARAMETERIIVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$273.PFNGLSAMPLERPARAMETERIIVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

