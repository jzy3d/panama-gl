// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETUNIFORMBUFFERSIZEEXTPROC {

    int apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLGETUNIFORMBUFFERSIZEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMBUFFERSIZEEXTPROC.class, fi, constants$602.PFNGLGETUNIFORMBUFFERSIZEEXTPROC$FUNC, "(II)I");
    }
    static MemoryAddress allocate(PFNGLGETUNIFORMBUFFERSIZEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETUNIFORMBUFFERSIZEEXTPROC.class, fi, constants$602.PFNGLGETUNIFORMBUFFERSIZEEXTPROC$FUNC, "(II)I", scope);
    }
    static PFNGLGETUNIFORMBUFFERSIZEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                return (int)constants$602.PFNGLGETUNIFORMBUFFERSIZEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


