// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLSAMPLEMAPATIPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLSAMPLEMAPATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLSAMPLEMAPATIPROC.class, fi, constants$491.PFNGLSAMPLEMAPATIPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLSAMPLEMAPATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLSAMPLEMAPATIPROC.class, fi, constants$491.PFNGLSAMPLEMAPATIPROC$FUNC, "(III)V", scope);
    }
    static PFNGLSAMPLEMAPATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$491.PFNGLSAMPLEMAPATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


