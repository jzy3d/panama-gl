// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTESTFENCENVPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLTESTFENCENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTESTFENCENVPROC.class, fi, constants$748.PFNGLTESTFENCENVPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLTESTFENCENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTESTFENCENVPROC.class, fi, constants$748.PFNGLTESTFENCENVPROC$FUNC, "(I)B", scope);
    }
    static PFNGLTESTFENCENVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$748.PFNGLTESTFENCENVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


