// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLNAMEDBUFFERSTORAGEPROC {

    void apply(int x0, long x1, jdk.incubator.foreign.MemoryAddress x2, int x3);
    static MemoryAddress allocate(PFNGLNAMEDBUFFERSTORAGEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERSTORAGEPROC.class, fi, constants$273.PFNGLNAMEDBUFFERSTORAGEPROC$FUNC, "(IJLjdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDBUFFERSTORAGEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERSTORAGEPROC.class, fi, constants$273.PFNGLNAMEDBUFFERSTORAGEPROC$FUNC, "(IJLjdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLNAMEDBUFFERSTORAGEPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, jdk.incubator.foreign.MemoryAddress x2, int x3) -> {
            try {
                constants$273.PFNGLNAMEDBUFFERSTORAGEPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

