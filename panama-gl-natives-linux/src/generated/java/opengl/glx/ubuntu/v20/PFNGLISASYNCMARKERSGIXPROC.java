// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLISASYNCMARKERSGIXPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISASYNCMARKERSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISASYNCMARKERSGIXPROC.class, fi, constants$977.PFNGLISASYNCMARKERSGIXPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISASYNCMARKERSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISASYNCMARKERSGIXPROC.class, fi, constants$977.PFNGLISASYNCMARKERSGIXPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISASYNCMARKERSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$977.PFNGLISASYNCMARKERSGIXPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


