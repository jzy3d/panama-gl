// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETFRAGDATALOCATIONEXTPROC {

    int apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGETFRAGDATALOCATIONEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETFRAGDATALOCATIONEXTPROC.class, fi, constants$718.PFNGLGETFRAGDATALOCATIONEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLGETFRAGDATALOCATIONEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETFRAGDATALOCATIONEXTPROC.class, fi, constants$718.PFNGLGETFRAGDATALOCATIONEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLGETFRAGDATALOCATIONEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$718.PFNGLGETFRAGDATALOCATIONEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

