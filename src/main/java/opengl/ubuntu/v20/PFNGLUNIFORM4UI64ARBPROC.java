// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLUNIFORM4UI64ARBPROC {

    void apply(int x0, long x1, long x2, long x3, long x4);
    static MemoryAddress allocate(PFNGLUNIFORM4UI64ARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM4UI64ARBPROC.class, fi, constants$334.PFNGLUNIFORM4UI64ARBPROC$FUNC, "(IJJJJ)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM4UI64ARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM4UI64ARBPROC.class, fi, constants$334.PFNGLUNIFORM4UI64ARBPROC$FUNC, "(IJJJJ)V", scope);
    }
    static PFNGLUNIFORM4UI64ARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, long x2, long x3, long x4) -> {
            try {
                constants$334.PFNGLUNIFORM4UI64ARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


