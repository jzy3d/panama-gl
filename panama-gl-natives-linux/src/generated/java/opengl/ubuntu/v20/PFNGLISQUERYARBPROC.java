// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLISQUERYARBPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISQUERYARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISQUERYARBPROC.class, fi, constants$346.PFNGLISQUERYARBPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISQUERYARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISQUERYARBPROC.class, fi, constants$346.PFNGLISQUERYARBPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISQUERYARBPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$346.PFNGLISQUERYARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


