// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDELETEVERTEXARRAYSPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLDELETEVERTEXARRAYSPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETEVERTEXARRAYSPROC.class, fi, constants$173.PFNGLDELETEVERTEXARRAYSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLDELETEVERTEXARRAYSPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETEVERTEXARRAYSPROC.class, fi, constants$173.PFNGLDELETEVERTEXARRAYSPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLDELETEVERTEXARRAYSPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$173.PFNGLDELETEVERTEXARRAYSPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

