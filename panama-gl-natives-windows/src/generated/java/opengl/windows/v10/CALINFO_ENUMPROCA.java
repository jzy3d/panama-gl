// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface CALINFO_ENUMPROCA {

    int apply(jdk.incubator.foreign.MemoryAddress x0);
    static NativeSymbol allocate(CALINFO_ENUMPROCA fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(CALINFO_ENUMPROCA.class, fi, constants$537.CALINFO_ENUMPROCA$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static CALINFO_ENUMPROCA ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("CALINFO_ENUMPROCA::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                return (int)constants$537.CALINFO_ENUMPROCA$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


