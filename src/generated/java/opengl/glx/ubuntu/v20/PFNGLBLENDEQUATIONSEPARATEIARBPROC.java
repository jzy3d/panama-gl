// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBLENDEQUATIONSEPARATEIARBPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLBLENDEQUATIONSEPARATEIARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONSEPARATEIARBPROC.class, fi, constants$406.PFNGLBLENDEQUATIONSEPARATEIARBPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLBLENDEQUATIONSEPARATEIARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONSEPARATEIARBPROC.class, fi, constants$406.PFNGLBLENDEQUATIONSEPARATEIARBPROC$FUNC, "(III)V", scope);
    }
    static PFNGLBLENDEQUATIONSEPARATEIARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$406.PFNGLBLENDEQUATIONSEPARATEIARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


