// Generated by jextract

package opengl.macos.v10_15_3;

import jdk.incubator.foreign.*;

public interface glutTimerFunc$func {

    void apply(int x0);
    static MemoryAddress allocate(glutTimerFunc$func fi) {
        return RuntimeHelper.upcallStub(glutTimerFunc$func.class, fi, constants$189.glutTimerFunc$func$FUNC, "(I)V");
    }
    static MemoryAddress allocate(glutTimerFunc$func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutTimerFunc$func.class, fi, constants$189.glutTimerFunc$func$FUNC, "(I)V", scope);
    }
    static glutTimerFunc$func ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$189.glutTimerFunc$func$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

