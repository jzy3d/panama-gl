// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETTEXTURESAMPLERHANDLENVPROC {

    long apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLGETTEXTURESAMPLERHANDLENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTURESAMPLERHANDLENVPROC.class, fi, constants$812.PFNGLGETTEXTURESAMPLERHANDLENVPROC$FUNC, "(II)J");
    }
    static MemoryAddress allocate(PFNGLGETTEXTURESAMPLERHANDLENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTURESAMPLERHANDLENVPROC.class, fi, constants$812.PFNGLGETTEXTURESAMPLERHANDLENVPROC$FUNC, "(II)J", scope);
    }
    static PFNGLGETTEXTURESAMPLERHANDLENVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (long)constants$812.PFNGLGETTEXTURESAMPLERHANDLENVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


