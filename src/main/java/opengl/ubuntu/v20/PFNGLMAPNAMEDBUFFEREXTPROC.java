// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMAPNAMEDBUFFEREXTPROC {

    jdk.incubator.foreign.MemoryAddress apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLMAPNAMEDBUFFEREXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMAPNAMEDBUFFEREXTPROC.class, fi, constants$570.PFNGLMAPNAMEDBUFFEREXTPROC$FUNC, "(II)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(PFNGLMAPNAMEDBUFFEREXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMAPNAMEDBUFFEREXTPROC.class, fi, constants$570.PFNGLMAPNAMEDBUFFEREXTPROC$FUNC, "(II)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static PFNGLMAPNAMEDBUFFEREXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$570.PFNGLMAPNAMEDBUFFEREXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

