// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLPOLYGONOFFSETCLAMPPROC {

    void apply(float x0, float x1, float x2);
    static MemoryAddress allocate(PFNGLPOLYGONOFFSETCLAMPPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLPOLYGONOFFSETCLAMPPROC.class, fi, constants$312.PFNGLPOLYGONOFFSETCLAMPPROC$FUNC, "(FFF)V");
    }
    static MemoryAddress allocate(PFNGLPOLYGONOFFSETCLAMPPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLPOLYGONOFFSETCLAMPPROC.class, fi, constants$312.PFNGLPOLYGONOFFSETCLAMPPROC$FUNC, "(FFF)V", scope);
    }
    static PFNGLPOLYGONOFFSETCLAMPPROC ofAddress(MemoryAddress addr) {
        return (float x0, float x1, float x2) -> {
            try {
                constants$312.PFNGLPOLYGONOFFSETCLAMPPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

