// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDELETEVERTEXARRAYSAPPLEPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDELETEVERTEXARRAYSAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETEVERTEXARRAYSAPPLEPROC.class, fi, constants$482.PFNGLDELETEVERTEXARRAYSAPPLEPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETEVERTEXARRAYSAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETEVERTEXARRAYSAPPLEPROC.class, fi, constants$482.PFNGLDELETEVERTEXARRAYSAPPLEPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETEVERTEXARRAYSAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$482.PFNGLDELETEVERTEXARRAYSAPPLEPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


