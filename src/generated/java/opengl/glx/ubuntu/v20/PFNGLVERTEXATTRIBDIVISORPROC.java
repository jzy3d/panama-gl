// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIBDIVISORPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLVERTEXATTRIBDIVISORPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBDIVISORPROC.class, fi, constants$276.PFNGLVERTEXATTRIBDIVISORPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIBDIVISORPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIBDIVISORPROC.class, fi, constants$276.PFNGLVERTEXATTRIBDIVISORPROC$FUNC, "(II)V", scope);
    }
    static PFNGLVERTEXATTRIBDIVISORPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$276.PFNGLVERTEXATTRIBDIVISORPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


