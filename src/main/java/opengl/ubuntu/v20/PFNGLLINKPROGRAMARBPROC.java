// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLLINKPROGRAMARBPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLLINKPROGRAMARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLLINKPROGRAMARBPROC.class, fi, constants$360.PFNGLLINKPROGRAMARBPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLLINKPROGRAMARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLLINKPROGRAMARBPROC.class, fi, constants$360.PFNGLLINKPROGRAMARBPROC$FUNC, "(I)V", scope);
    }
    static PFNGLLINKPROGRAMARBPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$360.PFNGLLINKPROGRAMARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


