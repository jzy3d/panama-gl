// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface glutKeyboardUpFunc$func {

    void apply(byte x0, int x1, int x2);
    static MemoryAddress allocate(glutKeyboardUpFunc$func fi) {
        return RuntimeHelper.upcallStub(glutKeyboardUpFunc$func.class, fi, constants$195.glutKeyboardUpFunc$func$FUNC, "(BII)V");
    }
    static MemoryAddress allocate(glutKeyboardUpFunc$func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutKeyboardUpFunc$func.class, fi, constants$195.glutKeyboardUpFunc$func$FUNC, "(BII)V", scope);
    }
    static glutKeyboardUpFunc$func ofAddress(MemoryAddress addr) {
        return (byte x0, int x1, int x2) -> {
            try {
                constants$196.glutKeyboardUpFunc$func$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


