// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface atexit$__func {

    void apply();
    static MemoryAddress allocate(atexit$__func fi) {
        return RuntimeHelper.upcallStub(atexit$__func.class, fi, constants$979.atexit$__func$FUNC, "()V");
    }
    static MemoryAddress allocate(atexit$__func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(atexit$__func.class, fi, constants$979.atexit$__func$FUNC, "()V", scope);
    }
    static atexit$__func ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$979.atexit$__func$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


