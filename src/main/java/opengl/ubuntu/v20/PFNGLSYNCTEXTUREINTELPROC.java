// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSYNCTEXTUREINTELPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLSYNCTEXTUREINTELPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSYNCTEXTUREINTELPROC.class, fi, constants$705.PFNGLSYNCTEXTUREINTELPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLSYNCTEXTUREINTELPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSYNCTEXTUREINTELPROC.class, fi, constants$705.PFNGLSYNCTEXTUREINTELPROC$FUNC, "(I)V", scope);
    }
    static PFNGLSYNCTEXTUREINTELPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$705.PFNGLSYNCTEXTUREINTELPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


