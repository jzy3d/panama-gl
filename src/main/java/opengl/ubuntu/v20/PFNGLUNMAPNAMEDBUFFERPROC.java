// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLUNMAPNAMEDBUFFERPROC {

    byte apply(int x0);
    static MemoryAddress allocate(PFNGLUNMAPNAMEDBUFFERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNMAPNAMEDBUFFERPROC.class, fi, constants$275.PFNGLUNMAPNAMEDBUFFERPROC$FUNC, "(I)B");
    }
    static MemoryAddress allocate(PFNGLUNMAPNAMEDBUFFERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNMAPNAMEDBUFFERPROC.class, fi, constants$275.PFNGLUNMAPNAMEDBUFFERPROC$FUNC, "(I)B", scope);
    }
    static PFNGLUNMAPNAMEDBUFFERPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                return (byte)constants$275.PFNGLUNMAPNAMEDBUFFERPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


