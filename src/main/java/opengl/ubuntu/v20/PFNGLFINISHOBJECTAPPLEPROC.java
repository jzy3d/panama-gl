// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLFINISHOBJECTAPPLEPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLFINISHOBJECTAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFINISHOBJECTAPPLEPROC.class, fi, constants$479.PFNGLFINISHOBJECTAPPLEPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLFINISHOBJECTAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFINISHOBJECTAPPLEPROC.class, fi, constants$479.PFNGLFINISHOBJECTAPPLEPROC$FUNC, "(II)V", scope);
    }
    static PFNGLFINISHOBJECTAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$479.PFNGLFINISHOBJECTAPPLEPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


