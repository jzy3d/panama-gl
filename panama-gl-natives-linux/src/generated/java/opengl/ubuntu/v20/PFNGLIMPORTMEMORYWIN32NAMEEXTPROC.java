// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLIMPORTMEMORYWIN32NAMEEXTPROC {

    void apply(int x0, long x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLIMPORTMEMORYWIN32NAMEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLIMPORTMEMORYWIN32NAMEEXTPROC.class, fi, constants$647.PFNGLIMPORTMEMORYWIN32NAMEEXTPROC$FUNC, "(IJILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLIMPORTMEMORYWIN32NAMEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLIMPORTMEMORYWIN32NAMEEXTPROC.class, fi, constants$647.PFNGLIMPORTMEMORYWIN32NAMEEXTPROC$FUNC, "(IJILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLIMPORTMEMORYWIN32NAMEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$647.PFNGLIMPORTMEMORYWIN32NAMEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


