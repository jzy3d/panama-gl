// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface glutSpecialUpFunc$func {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(glutSpecialUpFunc$func fi) {
        return RuntimeHelper.upcallStub(glutSpecialUpFunc$func.class, fi, constants$196.glutSpecialUpFunc$func$FUNC, "(III)V");
    }
    static MemoryAddress allocate(glutSpecialUpFunc$func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutSpecialUpFunc$func.class, fi, constants$196.glutSpecialUpFunc$func$FUNC, "(III)V", scope);
    }
    static glutSpecialUpFunc$func ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$196.glutSpecialUpFunc$func$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


