// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface glutIdleFunc$func {

    void apply();
    static MemoryAddress allocate(glutIdleFunc$func fi) {
        return RuntimeHelper.upcallStub(glutIdleFunc$func.class, fi, constants$188.glutIdleFunc$func$FUNC, "()V");
    }
    static MemoryAddress allocate(glutIdleFunc$func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutIdleFunc$func.class, fi, constants$188.glutIdleFunc$func$FUNC, "()V", scope);
    }
    static glutIdleFunc$func ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$189.glutIdleFunc$func$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


