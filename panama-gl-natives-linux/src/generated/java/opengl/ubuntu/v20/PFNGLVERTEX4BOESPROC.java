// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLVERTEX4BOESPROC {

    void apply(byte x0, byte x1, byte x2, byte x3);
    static MemoryAddress allocate(PFNGLVERTEX4BOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLVERTEX4BOESPROC.class, fi, constants$413.PFNGLVERTEX4BOESPROC$FUNC, "(BBBB)V");
    }
    static MemoryAddress allocate(PFNGLVERTEX4BOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLVERTEX4BOESPROC.class, fi, constants$413.PFNGLVERTEX4BOESPROC$FUNC, "(BBBB)V", scope);
    }
    static PFNGLVERTEX4BOESPROC ofAddress(MemoryAddress addr) {
        return (byte x0, byte x1, byte x2, byte x3) -> {
            try {
                constants$413.PFNGLVERTEX4BOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


