// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface glutJoystickFunc$func {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(glutJoystickFunc$func fi) {
        return RuntimeHelper.upcallStub(glutJoystickFunc$func.class, fi, constants$196.glutJoystickFunc$func$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(glutJoystickFunc$func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutJoystickFunc$func.class, fi, constants$196.glutJoystickFunc$func$FUNC, "(IIII)V", scope);
    }
    static glutJoystickFunc$func ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$197.glutJoystickFunc$func$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


