// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLSTENCILFILLPATHINSTANCEDNVPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, int x5, int x6, jdk.incubator.foreign.MemoryAddress x7);
    static MemoryAddress allocate(PFNGLSTENCILFILLPATHINSTANCEDNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILFILLPATHINSTANCEDNVPROC.class, fi, constants$794.PFNGLSTENCILFILLPATHINSTANCEDNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;IIIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLSTENCILFILLPATHINSTANCEDNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSTENCILFILLPATHINSTANCEDNVPROC.class, fi, constants$794.PFNGLSTENCILFILLPATHINSTANCEDNVPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;IIIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLSTENCILFILLPATHINSTANCEDNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, int x5, int x6, jdk.incubator.foreign.MemoryAddress x7) -> {
            try {
                constants$794.PFNGLSTENCILFILLPATHINSTANCEDNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6, x7);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

