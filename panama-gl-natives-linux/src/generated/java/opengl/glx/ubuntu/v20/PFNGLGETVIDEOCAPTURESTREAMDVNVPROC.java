// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETVIDEOCAPTURESTREAMDVNVPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFNGLGETVIDEOCAPTURESTREAMDVNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETVIDEOCAPTURESTREAMDVNVPROC.class, fi, constants$966.PFNGLGETVIDEOCAPTURESTREAMDVNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETVIDEOCAPTURESTREAMDVNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETVIDEOCAPTURESTREAMDVNVPROC.class, fi, constants$966.PFNGLGETVIDEOCAPTURESTREAMDVNVPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETVIDEOCAPTURESTREAMDVNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$966.PFNGLGETVIDEOCAPTURESTREAMDVNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


