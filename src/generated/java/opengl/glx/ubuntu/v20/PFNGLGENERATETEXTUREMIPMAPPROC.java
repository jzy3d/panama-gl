// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGENERATETEXTUREMIPMAPPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLGENERATETEXTUREMIPMAPPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGENERATETEXTUREMIPMAPPROC.class, fi, constants$378.PFNGLGENERATETEXTUREMIPMAPPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLGENERATETEXTUREMIPMAPPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGENERATETEXTUREMIPMAPPROC.class, fi, constants$378.PFNGLGENERATETEXTUREMIPMAPPROC$FUNC, "(I)V", scope);
    }
    static PFNGLGENERATETEXTUREMIPMAPPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$378.PFNGLGENERATETEXTUREMIPMAPPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


