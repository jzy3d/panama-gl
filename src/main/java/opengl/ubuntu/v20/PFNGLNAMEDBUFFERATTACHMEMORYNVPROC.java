// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLNAMEDBUFFERATTACHMEMORYNVPROC {

    void apply(int x0, int x1, long x2);
    static MemoryAddress allocate(PFNGLNAMEDBUFFERATTACHMEMORYNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERATTACHMEMORYNVPROC.class, fi, constants$781.PFNGLNAMEDBUFFERATTACHMEMORYNVPROC$FUNC, "(IIJ)V");
    }
    static MemoryAddress allocate(PFNGLNAMEDBUFFERATTACHMEMORYNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLNAMEDBUFFERATTACHMEMORYNVPROC.class, fi, constants$781.PFNGLNAMEDBUFFERATTACHMEMORYNVPROC$FUNC, "(IIJ)V", scope);
    }
    static PFNGLNAMEDBUFFERATTACHMEMORYNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, long x2) -> {
            try {
                constants$781.PFNGLNAMEDBUFFERATTACHMEMORYNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


