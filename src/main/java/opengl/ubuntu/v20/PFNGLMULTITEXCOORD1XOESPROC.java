// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMULTITEXCOORD1XOESPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD1XOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD1XOESPROC.class, fi, constants$435.PFNGLMULTITEXCOORD1XOESPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD1XOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD1XOESPROC.class, fi, constants$435.PFNGLMULTITEXCOORD1XOESPROC$FUNC, "(II)V", scope);
    }
    static PFNGLMULTITEXCOORD1XOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$435.PFNGLMULTITEXCOORD1XOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


