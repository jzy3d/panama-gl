// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface PSECURE_MEMORY_CACHE_CALLBACK {

    byte apply(jdk.incubator.foreign.MemoryAddress x0, long x1);
    static NativeSymbol allocate(PSECURE_MEMORY_CACHE_CALLBACK fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PSECURE_MEMORY_CACHE_CALLBACK.class, fi, constants$121.PSECURE_MEMORY_CACHE_CALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)B", scope);
    }
    static PSECURE_MEMORY_CACHE_CALLBACK ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("PSECURE_MEMORY_CACHE_CALLBACK::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, long x1) -> {
            try {
                return (byte)constants$121.PSECURE_MEMORY_CACHE_CALLBACK$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


