// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTEXBUMPPARAMETERIVATIPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLTEXBUMPPARAMETERIVATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXBUMPPARAMETERIVATIPROC.class, fi, constants$487.PFNGLTEXBUMPPARAMETERIVATIPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLTEXBUMPPARAMETERIVATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXBUMPPARAMETERIVATIPROC.class, fi, constants$487.PFNGLTEXBUMPPARAMETERIVATIPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLTEXBUMPPARAMETERIVATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$487.PFNGLTEXBUMPPARAMETERIVATIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


