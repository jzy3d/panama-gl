// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMULTITEXCOORD3XVOESPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD3XVOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD3XVOESPROC.class, fi, constants$437.PFNGLMULTITEXCOORD3XVOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD3XVOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD3XVOESPROC.class, fi, constants$437.PFNGLMULTITEXCOORD3XVOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLMULTITEXCOORD3XVOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$437.PFNGLMULTITEXCOORD3XVOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

