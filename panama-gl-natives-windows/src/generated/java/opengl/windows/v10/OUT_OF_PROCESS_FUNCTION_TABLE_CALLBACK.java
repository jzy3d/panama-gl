// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
    static NativeSymbol allocate(OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK.class, fi, constants$62.OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                return (int)constants$62.OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, (jdk.incubator.foreign.Addressable)x1, (jdk.incubator.foreign.Addressable)x2, (jdk.incubator.foreign.Addressable)x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


