// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface DATEFMT_ENUMPROCW {

    int apply(jdk.incubator.foreign.MemoryAddress x0);
    static NativeSymbol allocate(DATEFMT_ENUMPROCW fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(DATEFMT_ENUMPROCW.class, fi, constants$539.DATEFMT_ENUMPROCW$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static DATEFMT_ENUMPROCW ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("DATEFMT_ENUMPROCW::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                return (int)constants$539.DATEFMT_ENUMPROCW$MH.invokeExact(symbol, (jdk.incubator.foreign.Addressable)x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


