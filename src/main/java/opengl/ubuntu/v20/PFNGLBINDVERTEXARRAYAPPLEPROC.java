// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBINDVERTEXARRAYAPPLEPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLBINDVERTEXARRAYAPPLEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBINDVERTEXARRAYAPPLEPROC.class, fi, constants$481.PFNGLBINDVERTEXARRAYAPPLEPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLBINDVERTEXARRAYAPPLEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBINDVERTEXARRAYAPPLEPROC.class, fi, constants$481.PFNGLBINDVERTEXARRAYAPPLEPROC$FUNC, "(I)V", scope);
    }
    static PFNGLBINDVERTEXARRAYAPPLEPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$481.PFNGLBINDVERTEXARRAYAPPLEPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


