// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface glutMouseFunc$callback {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(glutMouseFunc$callback fi) {
        return RuntimeHelper.upcallStub(glutMouseFunc$callback.class, fi, constants$952.glutMouseFunc$callback$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(glutMouseFunc$callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutMouseFunc$callback.class, fi, constants$952.glutMouseFunc$callback$FUNC, "(IIII)V", scope);
    }
    static glutMouseFunc$callback ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$952.glutMouseFunc$callback$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


