// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLEVALUATEDEPTHVALUESARBPROC {

    void apply();
    static MemoryAddress allocate(PFNGLEVALUATEDEPTHVALUESARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLEVALUATEDEPTHVALUESARBPROC.class, fi, constants$357.PFNGLEVALUATEDEPTHVALUESARBPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLEVALUATEDEPTHVALUESARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLEVALUATEDEPTHVALUESARBPROC.class, fi, constants$357.PFNGLEVALUATEDEPTHVALUESARBPROC$FUNC, "()V", scope);
    }
    static PFNGLEVALUATEDEPTHVALUESARBPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$357.PFNGLEVALUATEDEPTHVALUESARBPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


