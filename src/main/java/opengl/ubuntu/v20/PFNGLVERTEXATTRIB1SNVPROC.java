// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLVERTEXATTRIB1SNVPROC {

    void apply(int x0, short x1);
    static MemoryAddress allocate(PFNGLVERTEXATTRIB1SNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB1SNVPROC.class, fi, constants$859.PFNGLVERTEXATTRIB1SNVPROC$FUNC, "(IS)V");
    }
    static MemoryAddress allocate(PFNGLVERTEXATTRIB1SNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEXATTRIB1SNVPROC.class, fi, constants$859.PFNGLVERTEXATTRIB1SNVPROC$FUNC, "(IS)V", scope);
    }
    static PFNGLVERTEXATTRIB1SNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, short x1) -> {
            try {
                constants$859.PFNGLVERTEXATTRIB1SNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


