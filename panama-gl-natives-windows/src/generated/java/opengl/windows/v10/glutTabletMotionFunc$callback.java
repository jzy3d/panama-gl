// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface glutTabletMotionFunc$callback {

    void apply(int x0, int x1);
    static NativeSymbol allocate(glutTabletMotionFunc$callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutTabletMotionFunc$callback.class, fi, constants$728.glutTabletMotionFunc$callback$FUNC, "(II)V", scope);
    }
    static glutTabletMotionFunc$callback ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("glutTabletMotionFunc$callback::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int x0, int x1) -> {
            try {
                constants$728.glutTabletMotionFunc$callback$MH.invokeExact(symbol, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


