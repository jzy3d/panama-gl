// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface glutTabletButtonFunc$callback {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(glutTabletButtonFunc$callback fi) {
        return RuntimeHelper.upcallStub(glutTabletButtonFunc$callback.class, fi, constants$961.glutTabletButtonFunc$callback$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(glutTabletButtonFunc$callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutTabletButtonFunc$callback.class, fi, constants$961.glutTabletButtonFunc$callback$FUNC, "(IIII)V", scope);
    }
    static glutTabletButtonFunc$callback ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$961.glutTabletButtonFunc$callback$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


