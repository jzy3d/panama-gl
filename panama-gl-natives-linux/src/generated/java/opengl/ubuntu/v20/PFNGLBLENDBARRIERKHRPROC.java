// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBLENDBARRIERKHRPROC {

    void apply();
    static MemoryAddress allocate(PFNGLBLENDBARRIERKHRPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDBARRIERKHRPROC.class, fi, constants$405.PFNGLBLENDBARRIERKHRPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLBLENDBARRIERKHRPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDBARRIERKHRPROC.class, fi, constants$405.PFNGLBLENDBARRIERKHRPROC$FUNC, "()V", scope);
    }
    static PFNGLBLENDBARRIERKHRPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$405.PFNGLBLENDBARRIERKHRPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


