// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLISTEXTUREEXTPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISTEXTUREEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISTEXTUREEXTPROC.class, fi, constants$757.PFNGLISTEXTUREEXTPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISTEXTUREEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISTEXTUREEXTPROC.class, fi, constants$757.PFNGLISTEXTUREEXTPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISTEXTUREEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$757.PFNGLISTEXTUREEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


