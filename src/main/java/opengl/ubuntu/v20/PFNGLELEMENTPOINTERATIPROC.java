// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLELEMENTPOINTERATIPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLELEMENTPOINTERATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLELEMENTPOINTERATIPROC.class, fi, constants$486.PFNGLELEMENTPOINTERATIPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLELEMENTPOINTERATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLELEMENTPOINTERATIPROC.class, fi, constants$486.PFNGLELEMENTPOINTERATIPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLELEMENTPOINTERATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$486.PFNGLELEMENTPOINTERATIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

