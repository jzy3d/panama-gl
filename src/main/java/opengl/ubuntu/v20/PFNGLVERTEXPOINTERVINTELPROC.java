// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXPOINTERVINTELPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLVERTEXPOINTERVINTELPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXPOINTERVINTELPROC.class, fi, constants$706.PFNGLVERTEXPOINTERVINTELPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXPOINTERVINTELPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXPOINTERVINTELPROC.class, fi, constants$706.PFNGLVERTEXPOINTERVINTELPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLVERTEXPOINTERVINTELPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$706.PFNGLVERTEXPOINTERVINTELPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

