// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIBBINDINGPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBBINDINGPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBBINDINGPROC.class, fi, constants$263.PFNGLVERTEXATTRIBBINDINGPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBBINDINGPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBBINDINGPROC.class, fi, constants$263.PFNGLVERTEXATTRIBBINDINGPROC$FUNC, "(II)V", scope);
    }
    static PFNGLVERTEXATTRIBBINDINGPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$263.PFNGLVERTEXATTRIBBINDINGPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


