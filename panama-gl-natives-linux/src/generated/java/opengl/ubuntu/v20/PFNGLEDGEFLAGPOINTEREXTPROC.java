// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLEDGEFLAGPOINTEREXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLEDGEFLAGPOINTEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLEDGEFLAGPOINTEREXTPROC.class, fi, constants$676.PFNGLEDGEFLAGPOINTEREXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLEDGEFLAGPOINTEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLEDGEFLAGPOINTEREXTPROC.class, fi, constants$676.PFNGLEDGEFLAGPOINTEREXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLEDGEFLAGPOINTEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$676.PFNGLEDGEFLAGPOINTEREXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


