// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface glutMenuStateFunc$callback {

    void apply(int x0);
    static NativeSymbol allocate(glutMenuStateFunc$callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutMenuStateFunc$callback.class, fi, constants$724.glutMenuStateFunc$callback$FUNC, "(I)V", scope);
    }
    static glutMenuStateFunc$callback ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("glutMenuStateFunc$callback::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int x0) -> {
            try {
                constants$724.glutMenuStateFunc$callback$MH.invokeExact(symbol, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


