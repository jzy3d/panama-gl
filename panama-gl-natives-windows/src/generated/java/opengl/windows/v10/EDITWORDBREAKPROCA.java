// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface EDITWORDBREAKPROCA {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3);
    static NativeSymbol allocate(EDITWORDBREAKPROCA fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(EDITWORDBREAKPROCA.class, fi, constants$408.EDITWORDBREAKPROCA$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;III)I", scope);
    }
    static EDITWORDBREAKPROCA ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("EDITWORDBREAKPROCA::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3) -> {
            try {
                return (int)constants$408.EDITWORDBREAKPROCA$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


