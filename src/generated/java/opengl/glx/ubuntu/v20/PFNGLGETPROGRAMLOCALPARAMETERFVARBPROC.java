// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETPROGRAMLOCALPARAMETERFVARBPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETPROGRAMLOCALPARAMETERFVARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMLOCALPARAMETERFVARBPROC.class, fi, constants$413.PFNGLGETPROGRAMLOCALPARAMETERFVARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETPROGRAMLOCALPARAMETERFVARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETPROGRAMLOCALPARAMETERFVARBPROC.class, fi, constants$413.PFNGLGETPROGRAMLOCALPARAMETERFVARBPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETPROGRAMLOCALPARAMETERFVARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$413.PFNGLGETPROGRAMLOCALPARAMETERFVARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


