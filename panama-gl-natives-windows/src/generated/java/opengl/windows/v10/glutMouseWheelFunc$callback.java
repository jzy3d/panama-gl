// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface glutMouseWheelFunc$callback {

    void apply(int x0, int x1, int x2, int x3);
    static NativeSymbol allocate(glutMouseWheelFunc$callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutMouseWheelFunc$callback.class, fi, constants$780.glutMouseWheelFunc$callback$FUNC, "(IIII)V", scope);
    }
    static glutMouseWheelFunc$callback ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("glutMouseWheelFunc$callback::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$780.glutMouseWheelFunc$callback$MH.invokeExact(symbol, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


