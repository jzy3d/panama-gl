// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface glutKeyboardUpFunc$callback {

    void apply(byte x0, int x1, int x2);
    static MemoryAddress allocate(glutKeyboardUpFunc$callback fi) {
        return RuntimeHelper.upcallStub(glutKeyboardUpFunc$callback.class, fi, constants$954.glutKeyboardUpFunc$callback$FUNC, "(BII)V");
    }
    static MemoryAddress allocate(glutKeyboardUpFunc$callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutKeyboardUpFunc$callback.class, fi, constants$954.glutKeyboardUpFunc$callback$FUNC, "(BII)V", scope);
    }
    static glutKeyboardUpFunc$callback ofAddress(MemoryAddress addr) {
        return (byte x0, int x1, int x2) -> {
            try {
                constants$954.glutKeyboardUpFunc$callback$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

