// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBINDMULTITEXTUREEXTPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLBINDMULTITEXTUREEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDMULTITEXTUREEXTPROC.class, fi, constants$633.PFNGLBINDMULTITEXTUREEXTPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLBINDMULTITEXTUREEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDMULTITEXTUREEXTPROC.class, fi, constants$633.PFNGLBINDMULTITEXTUREEXTPROC$FUNC, "(III)V", scope);
    }
    static PFNGLBINDMULTITEXTUREEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$633.PFNGLBINDMULTITEXTUREEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


