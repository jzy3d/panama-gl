// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPOLYGONOFFSETXOESPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLPOLYGONOFFSETXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPOLYGONOFFSETXOESPROC.class, fi, constants$422.PFNGLPOLYGONOFFSETXOESPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLPOLYGONOFFSETXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPOLYGONOFFSETXOESPROC.class, fi, constants$422.PFNGLPOLYGONOFFSETXOESPROC$FUNC, "(II)V", scope);
    }
    static PFNGLPOLYGONOFFSETXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$422.PFNGLPOLYGONOFFSETXOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


