// Generated by jextract

package opengl.macos.v10_15_3;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

public interface glutKeyboardFunc$func {

    void apply(byte x0, int x1, int x2);
    static MemoryAddress allocate(glutKeyboardFunc$func fi) {
        return RuntimeHelper.upcallStub(glutKeyboardFunc$func.class, fi, constants$185.glutKeyboardFunc$func$FUNC, "(BII)V");
    }
    static MemoryAddress allocate(glutKeyboardFunc$func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutKeyboardFunc$func.class, fi, constants$185.glutKeyboardFunc$func$FUNC, "(BII)V", scope);
    }
    static glutKeyboardFunc$func ofAddress(MemoryAddress addr) {
        return (byte x0, int x1, int x2) -> {
            try {
                constants$186.glutKeyboardFunc$func$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


