// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLISRENDERBUFFEREXTPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLISRENDERBUFFEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLISRENDERBUFFEREXTPROC.class, fi, constants$625.PFNGLISRENDERBUFFEREXTPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLISRENDERBUFFEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLISRENDERBUFFEREXTPROC.class, fi, constants$625.PFNGLISRENDERBUFFEREXTPROC$FUNC, "(I)B", scope);
    }
    static PFNGLISRENDERBUFFEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$625.PFNGLISRENDERBUFFEREXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

