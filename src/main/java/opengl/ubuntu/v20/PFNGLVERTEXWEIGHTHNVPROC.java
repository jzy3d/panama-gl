// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXWEIGHTHNVPROC {

    void apply(short x0);
    static MemoryAddress allocate(PFNGLVERTEXWEIGHTHNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXWEIGHTHNVPROC.class, fi, constants$774.PFNGLVERTEXWEIGHTHNVPROC$FUNC, "(S)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXWEIGHTHNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXWEIGHTHNVPROC.class, fi, constants$774.PFNGLVERTEXWEIGHTHNVPROC$FUNC, "(S)V", scope);
    }
    static PFNGLVERTEXWEIGHTHNVPROC ofAddress(MemoryAddress addr) {
        return (short x0) -> {
            try {
                constants$774.PFNGLVERTEXWEIGHTHNVPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

