// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETTEXBUMPPARAMETERIVATIPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGETTEXBUMPPARAMETERIVATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXBUMPPARAMETERIVATIPROC.class, fi, constants$573.PFNGLGETTEXBUMPPARAMETERIVATIPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETTEXBUMPPARAMETERIVATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETTEXBUMPPARAMETERIVATIPROC.class, fi, constants$573.PFNGLGETTEXBUMPPARAMETERIVATIPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETTEXBUMPPARAMETERIVATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$573.PFNGLGETTEXBUMPPARAMETERIVATIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


