// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPROVOKINGVERTEXEXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLPROVOKINGVERTEXEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPROVOKINGVERTEXEXTPROC.class, fi, constants$739.PFNGLPROVOKINGVERTEXEXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLPROVOKINGVERTEXEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPROVOKINGVERTEXEXTPROC.class, fi, constants$739.PFNGLPROVOKINGVERTEXEXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLPROVOKINGVERTEXEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$739.PFNGLPROVOKINGVERTEXEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


