// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLCREATESHADERPROGRAMEXTPROC {

    int apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLCREATESHADERPROGRAMEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLCREATESHADERPROGRAMEXTPROC.class, fi, constants$749.PFNGLCREATESHADERPROGRAMEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFNGLCREATESHADERPROGRAMEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLCREATESHADERPROGRAMEXTPROC.class, fi, constants$749.PFNGLCREATESHADERPROGRAMEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFNGLCREATESHADERPROGRAMEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$749.PFNGLCREATESHADERPROGRAMEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

