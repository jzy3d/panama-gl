// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface PGET_SYSTEM_WOW64_DIRECTORY_A {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
    static NativeSymbol allocate(PGET_SYSTEM_WOW64_DIRECTORY_A fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PGET_SYSTEM_WOW64_DIRECTORY_A.class, fi, constants$294.PGET_SYSTEM_WOW64_DIRECTORY_A$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
    }
    static PGET_SYSTEM_WOW64_DIRECTORY_A ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("PGET_SYSTEM_WOW64_DIRECTORY_A::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
            try {
                return (int)constants$294.PGET_SYSTEM_WOW64_DIRECTORY_A$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


