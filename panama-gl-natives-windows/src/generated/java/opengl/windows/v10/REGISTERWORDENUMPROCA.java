// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface REGISTERWORDENUMPROCA {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
    static NativeSymbol allocate(REGISTERWORDENUMPROCA fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(REGISTERWORDENUMPROCA.class, fi, constants$630.REGISTERWORDENUMPROCA$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static REGISTERWORDENUMPROCA ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("REGISTERWORDENUMPROCA::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                return (int)constants$630.REGISTERWORDENUMPROCA$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, x1, (jdk.incubator.foreign.Addressable)x2, (jdk.incubator.foreign.Addressable)x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


