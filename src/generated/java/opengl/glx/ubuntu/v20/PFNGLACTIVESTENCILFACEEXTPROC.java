// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLACTIVESTENCILFACEEXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLACTIVESTENCILFACEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLACTIVESTENCILFACEEXTPROC.class, fi, constants$751.PFNGLACTIVESTENCILFACEEXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLACTIVESTENCILFACEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLACTIVESTENCILFACEEXTPROC.class, fi, constants$751.PFNGLACTIVESTENCILFACEEXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLACTIVESTENCILFACEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$751.PFNGLACTIVESTENCILFACEEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


