// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETVARIANTARRAYOBJECTFVATIPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETVARIANTARRAYOBJECTFVATIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETVARIANTARRAYOBJECTFVATIPROC.class, fi, constants$584.PFNGLGETVARIANTARRAYOBJECTFVATIPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETVARIANTARRAYOBJECTFVATIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETVARIANTARRAYOBJECTFVATIPROC.class, fi, constants$584.PFNGLGETVARIANTARRAYOBJECTFVATIPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETVARIANTARRAYOBJECTFVATIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$584.PFNGLGETVARIANTARRAYOBJECTFVATIPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


