// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface LOCALE_ENUMPROCA {

    int apply(jdk.incubator.foreign.MemoryAddress x0);
    static NativeSymbol allocate(LOCALE_ENUMPROCA fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(LOCALE_ENUMPROCA.class, fi, constants$534.LOCALE_ENUMPROCA$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static LOCALE_ENUMPROCA ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("LOCALE_ENUMPROCA::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                return (int)constants$534.LOCALE_ENUMPROCA$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


