// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface glutDisplayFunc$callback {

    void apply();
    static MemoryAddress allocate(glutDisplayFunc$callback fi) {
        return RuntimeHelper.upcallStub(glutDisplayFunc$callback.class, fi, constants$952.glutDisplayFunc$callback$FUNC, "()V");
    }
    static MemoryAddress allocate(glutDisplayFunc$callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutDisplayFunc$callback.class, fi, constants$952.glutDisplayFunc$callback$FUNC, "()V", scope);
    }
    static glutDisplayFunc$callback ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$952.glutDisplayFunc$callback$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

