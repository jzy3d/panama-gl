// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPOLYGONOFFSETCLAMPEXTPROC {

    void apply(float x0, float x1, float x2);
    static MemoryAddress allocate(PFNGLPOLYGONOFFSETCLAMPEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPOLYGONOFFSETCLAMPEXTPROC.class, fi, constants$653.PFNGLPOLYGONOFFSETCLAMPEXTPROC$FUNC, "(FFF)V");
    }
    static MemoryAddress allocate(PFNGLPOLYGONOFFSETCLAMPEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPOLYGONOFFSETCLAMPEXTPROC.class, fi, constants$653.PFNGLPOLYGONOFFSETCLAMPEXTPROC$FUNC, "(FFF)V", scope);
    }
    static PFNGLPOLYGONOFFSETCLAMPEXTPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1, float x2) -> {
            try {
                constants$653.PFNGLPOLYGONOFFSETCLAMPEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


