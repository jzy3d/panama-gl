// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIBI1IPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBI1IPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI1IPROC.class, fi, constants$152.PFNGLVERTEXATTRIBI1IPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBI1IPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBI1IPROC.class, fi, constants$152.PFNGLVERTEXATTRIBI1IPROC$FUNC, "(II)V", scope);
    }
    static PFNGLVERTEXATTRIBI1IPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$152.PFNGLVERTEXATTRIBI1IPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


