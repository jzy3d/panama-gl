// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSETFENCEAPPLEPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLSETFENCEAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSETFENCEAPPLEPROC.class, fi, constants$477.PFNGLSETFENCEAPPLEPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLSETFENCEAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSETFENCEAPPLEPROC.class, fi, constants$477.PFNGLSETFENCEAPPLEPROC$FUNC, "(I)V", scope);
    }
    static PFNGLSETFENCEAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$477.PFNGLSETFENCEAPPLEPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


