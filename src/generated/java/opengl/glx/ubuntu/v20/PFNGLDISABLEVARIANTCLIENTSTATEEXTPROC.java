// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDISABLEVARIANTCLIENTSTATEEXTPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLDISABLEVARIANTCLIENTSTATEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDISABLEVARIANTCLIENTSTATEEXTPROC.class, fi, constants$775.PFNGLDISABLEVARIANTCLIENTSTATEEXTPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLDISABLEVARIANTCLIENTSTATEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDISABLEVARIANTCLIENTSTATEEXTPROC.class, fi, constants$775.PFNGLDISABLEVARIANTCLIENTSTATEEXTPROC$FUNC, "(I)V", scope);
    }
    static PFNGLDISABLEVARIANTCLIENTSTATEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$775.PFNGLDISABLEVARIANTCLIENTSTATEEXTPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


