// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETTEXTUREHANDLENVPROC {

    long apply(int x0);
    static MemoryAddress allocate(PFNGLGETTEXTUREHANDLENVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTUREHANDLENVPROC.class, fi, constants$726.PFNGLGETTEXTUREHANDLENVPROC$FUNC, "(I)J");
    }
    static MemoryAddress allocate(PFNGLGETTEXTUREHANDLENVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTUREHANDLENVPROC.class, fi, constants$726.PFNGLGETTEXTUREHANDLENVPROC$FUNC, "(I)J", scope);
    }
    static PFNGLGETTEXTUREHANDLENVPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (long)constants$726.PFNGLGETTEXTUREHANDLENVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


