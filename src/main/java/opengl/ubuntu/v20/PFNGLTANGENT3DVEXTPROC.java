// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTANGENT3DVEXTPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLTANGENT3DVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTANGENT3DVEXTPROC.class, fi, constants$525.PFNGLTANGENT3DVEXTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLTANGENT3DVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTANGENT3DVEXTPROC.class, fi, constants$525.PFNGLTANGENT3DVEXTPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLTANGENT3DVEXTPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$525.PFNGLTANGENT3DVEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


