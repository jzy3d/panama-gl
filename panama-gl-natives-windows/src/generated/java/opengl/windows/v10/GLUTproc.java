// Generated by jextract

package opengl.windows.v10;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
public interface GLUTproc {

    void apply();
    static NativeSymbol allocate(GLUTproc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(GLUTproc.class, fi, constants$786.GLUTproc$FUNC, "()V", scope);
    }
    static GLUTproc ofAddress(MemoryAddress addr, ResourceScope scope) {
        NativeSymbol symbol = NativeSymbol.ofAddress("GLUTproc::" + Long.toHexString(addr.toRawLongValue()), addr, scope);
return () -> {
            try {
                constants$786.GLUTproc$MH.invokeExact(symbol);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


