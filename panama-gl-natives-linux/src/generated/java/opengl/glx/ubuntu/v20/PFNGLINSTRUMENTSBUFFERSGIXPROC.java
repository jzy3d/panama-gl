// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLINSTRUMENTSBUFFERSGIXPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLINSTRUMENTSBUFFERSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLINSTRUMENTSBUFFERSGIXPROC.class, fi, constants$985.PFNGLINSTRUMENTSBUFFERSGIXPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLINSTRUMENTSBUFFERSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLINSTRUMENTSBUFFERSGIXPROC.class, fi, constants$985.PFNGLINSTRUMENTSBUFFERSGIXPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLINSTRUMENTSBUFFERSGIXPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$985.PFNGLINSTRUMENTSBUFFERSGIXPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

