// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GLUtessBeginDataProc {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static NativeSymbol allocate(GLUtessBeginDataProc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GLUtessBeginDataProc.class, fi, constants$706.GLUtessBeginDataProc$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static GLUtessBeginDataProc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GLUtessBeginDataProc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$706.GLUtessBeginDataProc$MH.invokeExact(symbol, x0, (jdk.incubator.foreign.Addressable)x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


