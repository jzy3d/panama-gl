// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLRASTERPOS2XOESPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLRASTERPOS2XOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLRASTERPOS2XOESPROC.class, fi, constants$440.PFNGLRASTERPOS2XOESPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLRASTERPOS2XOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLRASTERPOS2XOESPROC.class, fi, constants$440.PFNGLRASTERPOS2XOESPROC$FUNC, "(II)V", scope);
    }
    static PFNGLRASTERPOS2XOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$440.PFNGLRASTERPOS2XOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


