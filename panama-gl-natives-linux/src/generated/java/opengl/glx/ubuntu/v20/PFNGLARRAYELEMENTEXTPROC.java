// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLARRAYELEMENTEXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLARRAYELEMENTEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLARRAYELEMENTEXTPROC.class, fi, constants$761.PFNGLARRAYELEMENTEXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLARRAYELEMENTEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLARRAYELEMENTEXTPROC.class, fi, constants$761.PFNGLARRAYELEMENTEXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLARRAYELEMENTEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$761.PFNGLARRAYELEMENTEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


