// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBUFFERSTORAGEMEMEXTPROC {

    void apply(int x0, long x1, int x2, long x3);
    static MemoryAddress allocate(PFNGLBUFFERSTORAGEMEMEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBUFFERSTORAGEMEMEXTPROC.class, fi, constants$644.PFNGLBUFFERSTORAGEMEMEXTPROC$FUNC, "(IJIJ)V");
    }
    static MemoryAddress allocate(PFNGLBUFFERSTORAGEMEMEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBUFFERSTORAGEMEMEXTPROC.class, fi, constants$644.PFNGLBUFFERSTORAGEMEMEXTPROC$FUNC, "(IJIJ)V", scope);
    }
    static PFNGLBUFFERSTORAGEMEMEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, long x1, int x2, long x3) -> {
            try {
                constants$644.PFNGLBUFFERSTORAGEMEMEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


