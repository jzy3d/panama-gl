// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSECONDARYCOLOR3UBEXTPROC {

    void apply(byte x0, byte x1, byte x2);
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3UBEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3UBEXTPROC.class, fi, constants$658.PFNGLSECONDARYCOLOR3UBEXTPROC$FUNC, "(BBB)V");
    }
    static MemoryAddress allocate(PFNGLSECONDARYCOLOR3UBEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSECONDARYCOLOR3UBEXTPROC.class, fi, constants$658.PFNGLSECONDARYCOLOR3UBEXTPROC$FUNC, "(BBB)V", scope);
    }
    static PFNGLSECONDARYCOLOR3UBEXTPROC ofAddress(MemoryAddress addr) {
        return (byte x0, byte x1, byte x2) -> {
            try {
                constants$658.PFNGLSECONDARYCOLOR3UBEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


