// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLENABLECLIENTSTATEINDEXEDEXTPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLENABLECLIENTSTATEINDEXEDEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLENABLECLIENTSTATEINDEXEDEXTPROC.class, fi, constants$560.PFNGLENABLECLIENTSTATEINDEXEDEXTPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLENABLECLIENTSTATEINDEXEDEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLENABLECLIENTSTATEINDEXEDEXTPROC.class, fi, constants$560.PFNGLENABLECLIENTSTATEINDEXEDEXTPROC$FUNC, "(II)V", scope);
    }
    static PFNGLENABLECLIENTSTATEINDEXEDEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$560.PFNGLENABLECLIENTSTATEINDEXEDEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


