// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLMULTIDRAWMESHTASKSINDIRECTCOUNTNVPROC {

    void apply(long x0, long x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLMULTIDRAWMESHTASKSINDIRECTCOUNTNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWMESHTASKSINDIRECTCOUNTNVPROC.class, fi, constants$782.PFNGLMULTIDRAWMESHTASKSINDIRECTCOUNTNVPROC$FUNC, "(JJII)V");
    }
    static MemoryAddress allocate(PFNGLMULTIDRAWMESHTASKSINDIRECTCOUNTNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLMULTIDRAWMESHTASKSINDIRECTCOUNTNVPROC.class, fi, constants$782.PFNGLMULTIDRAWMESHTASKSINDIRECTCOUNTNVPROC$FUNC, "(JJII)V", scope);
    }
    static PFNGLMULTIDRAWMESHTASKSINDIRECTCOUNTNVPROC ofAddress(MemoryAddress addr) {
        return (long x0, long x1, int x2, int x3) -> {
            try {
                constants$782.PFNGLMULTIDRAWMESHTASKSINDIRECTCOUNTNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

