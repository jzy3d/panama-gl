// Generated by jextract

package opengl.macos.v11_4;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface glutTabletButtonFunc$func {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(glutTabletButtonFunc$func fi) {
        return RuntimeHelper.upcallStub(glutTabletButtonFunc$func.class, fi, constants$193.glutTabletButtonFunc$func$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(glutTabletButtonFunc$func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutTabletButtonFunc$func.class, fi, constants$193.glutTabletButtonFunc$func$FUNC, "(IIII)V", scope);
    }
    static glutTabletButtonFunc$func ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$194.glutTabletButtonFunc$func$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


