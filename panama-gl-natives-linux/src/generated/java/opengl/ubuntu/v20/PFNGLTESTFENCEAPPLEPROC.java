// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTESTFENCEAPPLEPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLTESTFENCEAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTESTFENCEAPPLEPROC.class, fi, constants$478.PFNGLTESTFENCEAPPLEPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLTESTFENCEAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTESTFENCEAPPLEPROC.class, fi, constants$478.PFNGLTESTFENCEAPPLEPROC$FUNC, "(I)B", scope);
    }
    static PFNGLTESTFENCEAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$478.PFNGLTESTFENCEAPPLEPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


