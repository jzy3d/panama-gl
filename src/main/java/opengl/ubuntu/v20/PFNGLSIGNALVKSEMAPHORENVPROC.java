// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSIGNALVKSEMAPHORENVPROC {

    void apply(long x0);
    static MemoryAddress allocate(PFNGLSIGNALVKSEMAPHORENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSIGNALVKSEMAPHORENVPROC.class, fi, constants$742.PFNGLSIGNALVKSEMAPHORENVPROC$FUNC, "(J)V");
    }
    static MemoryAddress allocate(PFNGLSIGNALVKSEMAPHORENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSIGNALVKSEMAPHORENVPROC.class, fi, constants$742.PFNGLSIGNALVKSEMAPHORENVPROC$FUNC, "(J)V", scope);
    }
    static PFNGLSIGNALVKSEMAPHORENVPROC ofAddress(MemoryAddress addr) {
        return (long x0) -> {
            try {
                constants$742.PFNGLSIGNALVKSEMAPHORENVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


