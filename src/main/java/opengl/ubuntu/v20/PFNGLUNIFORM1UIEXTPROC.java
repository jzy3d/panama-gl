// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLUNIFORM1UIEXTPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLUNIFORM1UIEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1UIEXTPROC.class, fi, constants$633.PFNGLUNIFORM1UIEXTPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLUNIFORM1UIEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNIFORM1UIEXTPROC.class, fi, constants$633.PFNGLUNIFORM1UIEXTPROC$FUNC, "(II)V", scope);
    }
    static PFNGLUNIFORM1UIEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$633.PFNGLUNIFORM1UIEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


