// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMULTITEXCOORD2BOESPROC {

    void apply(int x0, byte x1, byte x2);
    static MemoryAddress allocate(PFNGLMULTITEXCOORD2BOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD2BOESPROC.class, fi, constants$407.PFNGLMULTITEXCOORD2BOESPROC$FUNC, "(IBB)V");
    }
    static MemoryAddress allocate(PFNGLMULTITEXCOORD2BOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTITEXCOORD2BOESPROC.class, fi, constants$407.PFNGLMULTITEXCOORD2BOESPROC$FUNC, "(IBB)V", scope);
    }
    static PFNGLMULTITEXCOORD2BOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, byte x1, byte x2) -> {
            try {
                constants$407.PFNGLMULTITEXCOORD2BOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


