// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLRELEASESHADERCOMPILERPROC {

    void apply();
    static MemoryAddress allocate(PFNGLRELEASESHADERCOMPILERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLRELEASESHADERCOMPILERPROC.class, fi, constants$219.PFNGLRELEASESHADERCOMPILERPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLRELEASESHADERCOMPILERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLRELEASESHADERCOMPILERPROC.class, fi, constants$219.PFNGLRELEASESHADERCOMPILERPROC$FUNC, "()V", scope);
    }
    static PFNGLRELEASESHADERCOMPILERPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$219.PFNGLRELEASESHADERCOMPILERPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


