// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLIMAGETRANSFORMPARAMETERIVHPPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLIMAGETRANSFORMPARAMETERIVHPPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLIMAGETRANSFORMPARAMETERIVHPPROC.class, fi, constants$785.PFNGLIMAGETRANSFORMPARAMETERIVHPPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLIMAGETRANSFORMPARAMETERIVHPPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLIMAGETRANSFORMPARAMETERIVHPPROC.class, fi, constants$785.PFNGLIMAGETRANSFORMPARAMETERIVHPPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLIMAGETRANSFORMPARAMETERIVHPPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$785.PFNGLIMAGETRANSFORMPARAMETERIVHPPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


