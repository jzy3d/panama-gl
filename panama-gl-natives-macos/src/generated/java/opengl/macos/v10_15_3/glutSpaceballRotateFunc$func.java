// Generated by jextract

package opengl.macos.v10_15_3;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

public interface glutSpaceballRotateFunc$func {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(glutSpaceballRotateFunc$func fi) {
        return RuntimeHelper.upcallStub(glutSpaceballRotateFunc$func.class, fi, constants$191.glutSpaceballRotateFunc$func$FUNC, "(III)V");
    }
    static MemoryAddress allocate(glutSpaceballRotateFunc$func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutSpaceballRotateFunc$func.class, fi, constants$191.glutSpaceballRotateFunc$func$FUNC, "(III)V", scope);
    }
    static glutSpaceballRotateFunc$func ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$191.glutSpaceballRotateFunc$func$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


