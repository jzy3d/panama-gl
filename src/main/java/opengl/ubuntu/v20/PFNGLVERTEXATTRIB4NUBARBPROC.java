// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIB4NUBARBPROC {

    void apply(int x0, byte x1, byte x2, byte x3, byte x4);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB4NUBARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4NUBARBPROC.class, fi, constants$392.PFNGLVERTEXATTRIB4NUBARBPROC$FUNC, "(IBBBB)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB4NUBARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB4NUBARBPROC.class, fi, constants$392.PFNGLVERTEXATTRIB4NUBARBPROC$FUNC, "(IBBBB)V", scope);
    }
    static PFNGLVERTEXATTRIB4NUBARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, byte x1, byte x2, byte x3, byte x4) -> {
            try {
                constants$392.PFNGLVERTEXATTRIB4NUBARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


