// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBEGINCONDITIONALRENDERNVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBEGINCONDITIONALRENDERNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBEGINCONDITIONALRENDERNVPROC.class, fi, constants$737.PFNGLBEGINCONDITIONALRENDERNVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBEGINCONDITIONALRENDERNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBEGINCONDITIONALRENDERNVPROC.class, fi, constants$737.PFNGLBEGINCONDITIONALRENDERNVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBEGINCONDITIONALRENDERNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$737.PFNGLBEGINCONDITIONALRENDERNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


