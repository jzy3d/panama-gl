// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLACTIVESHADERPROGRAMPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLACTIVESHADERPROGRAMPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLACTIVESHADERPROGRAMPROC.class, fi, constants$222.PFNGLACTIVESHADERPROGRAMPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLACTIVESHADERPROGRAMPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLACTIVESHADERPROGRAMPROC.class, fi, constants$222.PFNGLACTIVESHADERPROGRAMPROC$FUNC, "(II)V", scope);
    }
    static PFNGLACTIVESHADERPROGRAMPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$222.PFNGLACTIVESHADERPROGRAMPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

