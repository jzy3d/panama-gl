// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLISQUERYPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISQUERYPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISQUERYPROC.class, fi, constants$193.PFNGLISQUERYPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISQUERYPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISQUERYPROC.class, fi, constants$193.PFNGLISQUERYPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISQUERYPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$193.PFNGLISQUERYPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


