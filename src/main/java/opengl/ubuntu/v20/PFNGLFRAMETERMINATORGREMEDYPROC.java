// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLFRAMETERMINATORGREMEDYPROC {

    void apply();
    static MemoryAddress allocate(PFNGLFRAMETERMINATORGREMEDYPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFRAMETERMINATORGREMEDYPROC.class, fi, constants$698.PFNGLFRAMETERMINATORGREMEDYPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLFRAMETERMINATORGREMEDYPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFRAMETERMINATORGREMEDYPROC.class, fi, constants$698.PFNGLFRAMETERMINATORGREMEDYPROC$FUNC, "()V", scope);
    }
    static PFNGLFRAMETERMINATORGREMEDYPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$698.PFNGLFRAMETERMINATORGREMEDYPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


