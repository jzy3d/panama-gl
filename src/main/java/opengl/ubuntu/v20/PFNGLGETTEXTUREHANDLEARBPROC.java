// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETTEXTUREHANDLEARBPROC {

    long apply(int x0);
    static MemoryAddress allocate(PFNGLGETTEXTUREHANDLEARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTUREHANDLEARBPROC.class, fi, constants$312.PFNGLGETTEXTUREHANDLEARBPROC$FUNC, "(I)J");
    }
    static MemoryAddress allocate(PFNGLGETTEXTUREHANDLEARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXTUREHANDLEARBPROC.class, fi, constants$312.PFNGLGETTEXTUREHANDLEARBPROC$FUNC, "(I)J", scope);
    }
    static PFNGLGETTEXTUREHANDLEARBPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (long)constants$312.PFNGLGETTEXTUREHANDLEARBPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


