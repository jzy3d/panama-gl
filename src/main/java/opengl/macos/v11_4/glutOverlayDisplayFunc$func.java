// Generated by jextract

package opengl.macos.v11_4;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface glutOverlayDisplayFunc$func {

    void apply();
    static MemoryAddress allocate(glutOverlayDisplayFunc$func fi) {
        return RuntimeHelper.upcallStub(glutOverlayDisplayFunc$func.class, fi, constants$194.glutOverlayDisplayFunc$func$FUNC, "()V");
    }
    static MemoryAddress allocate(glutOverlayDisplayFunc$func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutOverlayDisplayFunc$func.class, fi, constants$194.glutOverlayDisplayFunc$func$FUNC, "()V", scope);
    }
    static glutOverlayDisplayFunc$func ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$195.glutOverlayDisplayFunc$func$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


