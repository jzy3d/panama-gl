// Generated by jextract

package opengl.macos.v10_15_3;

import jdk.incubator.foreign.*;

public interface glutSpecialFunc$func {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(glutSpecialFunc$func fi) {
        return RuntimeHelper.upcallStub(glutSpecialFunc$func.class, fi, constants$190.glutSpecialFunc$func$FUNC, "(III)V");
    }
    static MemoryAddress allocate(glutSpecialFunc$func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutSpecialFunc$func.class, fi, constants$190.glutSpecialFunc$func$FUNC, "(III)V", scope);
    }
    static glutSpecialFunc$func ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$190.glutSpecialFunc$func$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


