// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLNAMEDBUFFERSUBDATAEXTPROC {

    void apply(int x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLNAMEDBUFFERSUBDATAEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERSUBDATAEXTPROC.class, fi, constants$570.PFNGLNAMEDBUFFERSUBDATAEXTPROC$FUNC, "(IJJLjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDBUFFERSUBDATAEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERSUBDATAEXTPROC.class, fi, constants$570.PFNGLNAMEDBUFFERSUBDATAEXTPROC$FUNC, "(IJJLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLNAMEDBUFFERSUBDATAEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$570.PFNGLNAMEDBUFFERSUBDATAEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


