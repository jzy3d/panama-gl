// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBINDPROGRAMNVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBINDPROGRAMNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDPROGRAMNVPROC.class, fi, constants$850.PFNGLBINDPROGRAMNVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBINDPROGRAMNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDPROGRAMNVPROC.class, fi, constants$850.PFNGLBINDPROGRAMNVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBINDPROGRAMNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$850.PFNGLBINDPROGRAMNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


