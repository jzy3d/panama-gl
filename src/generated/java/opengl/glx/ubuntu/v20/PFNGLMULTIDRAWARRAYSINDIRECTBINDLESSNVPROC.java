// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1, int x2, int x3, int x4);
    static MemoryAddress allocate(PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROC.class, fi, constants$810.PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;III)V");
    }
    static MemoryAddress allocate(PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROC.class, fi, constants$810.PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;III)V", scope);
    }
    static PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1, int x2, int x3, int x4) -> {
            try {
                constants$810.PFNGLMULTIDRAWARRAYSINDIRECTBINDLESSNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


