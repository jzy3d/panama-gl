// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLEGLIMAGETARGETTEXSTORAGEEXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLEGLIMAGETARGETTEXSTORAGEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLEGLIMAGETARGETTEXSTORAGEEXTPROC.class, fi, constants$515.PFNGLEGLIMAGETARGETTEXSTORAGEEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLEGLIMAGETARGETTEXSTORAGEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLEGLIMAGETARGETTEXSTORAGEEXTPROC.class, fi, constants$515.PFNGLEGLIMAGETARGETTEXSTORAGEEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLEGLIMAGETARGETTEXSTORAGEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$515.PFNGLEGLIMAGETARGETTEXSTORAGEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


