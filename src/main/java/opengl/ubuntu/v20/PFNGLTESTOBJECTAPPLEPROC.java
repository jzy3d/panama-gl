// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTESTOBJECTAPPLEPROC {

    byte apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLTESTOBJECTAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTESTOBJECTAPPLEPROC.class, fi, constants$478.PFNGLTESTOBJECTAPPLEPROC$FUNC, "(II)B");
    }
    static MemoryAddress allocate(PFNGLTESTOBJECTAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTESTOBJECTAPPLEPROC.class, fi, constants$478.PFNGLTESTOBJECTAPPLEPROC$FUNC, "(II)B", scope);
    }
    static PFNGLTESTOBJECTAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (byte)constants$478.PFNGLTESTOBJECTAPPLEPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


