// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXSTREAM1IATIPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLVERTEXSTREAM1IATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM1IATIPROC.class, fi, constants$501.PFNGLVERTEXSTREAM1IATIPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXSTREAM1IATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXSTREAM1IATIPROC.class, fi, constants$501.PFNGLVERTEXSTREAM1IATIPROC$FUNC, "(II)V", scope);
    }
    static PFNGLVERTEXSTREAM1IATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$501.PFNGLVERTEXSTREAM1IATIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


