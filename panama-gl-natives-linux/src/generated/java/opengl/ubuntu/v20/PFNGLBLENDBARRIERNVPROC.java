// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLBLENDBARRIERNVPROC {

    void apply();
    static MemoryAddress allocate(PFNGLBLENDBARRIERNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDBARRIERNVPROC.class, fi, constants$731.PFNGLBLENDBARRIERNVPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLBLENDBARRIERNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDBARRIERNVPROC.class, fi, constants$731.PFNGLBLENDBARRIERNVPROC$FUNC, "()V", scope);
    }
    static PFNGLBLENDBARRIERNVPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$731.PFNGLBLENDBARRIERNVPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

