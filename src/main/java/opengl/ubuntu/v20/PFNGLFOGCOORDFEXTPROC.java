// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLFOGCOORDFEXTPROC {

    void apply(float x0);
    static MemoryAddress allocate(PFNGLFOGCOORDFEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFOGCOORDFEXTPROC.class, fi, constants$623.PFNGLFOGCOORDFEXTPROC$FUNC, "(F)V");
    }
    static MemoryAddress allocate(PFNGLFOGCOORDFEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFOGCOORDFEXTPROC.class, fi, constants$623.PFNGLFOGCOORDFEXTPROC$FUNC, "(F)V", scope);
    }
    static PFNGLFOGCOORDFEXTPROC ofAddress(MemoryAddress addr) {
        return (float x0) -> {
            try {
                constants$623.PFNGLFOGCOORDFEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


