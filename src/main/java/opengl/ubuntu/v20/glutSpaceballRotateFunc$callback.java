// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface glutSpaceballRotateFunc$callback {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(glutSpaceballRotateFunc$callback fi) {
        return RuntimeHelper.upcallStub(glutSpaceballRotateFunc$callback.class, fi, constants$958.glutSpaceballRotateFunc$callback$FUNC, "(III)V");
    }
    static MemoryAddress allocate(glutSpaceballRotateFunc$callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutSpaceballRotateFunc$callback.class, fi, constants$958.glutSpaceballRotateFunc$callback$FUNC, "(III)V", scope);
    }
    static glutSpaceballRotateFunc$callback ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$958.glutSpaceballRotateFunc$callback$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


