// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface PGET_MODULE_HANDLE_EXA {

    int apply(int x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
    static NativeSymbol allocate(PGET_MODULE_HANDLE_EXA fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PGET_MODULE_HANDLE_EXA.class, fi, constants$226.PGET_MODULE_HANDLE_EXA$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PGET_MODULE_HANDLE_EXA ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("PGET_MODULE_HANDLE_EXA::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                return (int)constants$226.PGET_MODULE_HANDLE_EXA$MH.invokeExact(symbol, x0, (jdk.incubator.foreign.Addressable)x1, (jdk.incubator.foreign.Addressable)x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


