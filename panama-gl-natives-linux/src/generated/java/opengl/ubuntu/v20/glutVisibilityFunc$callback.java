// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface glutVisibilityFunc$callback {

    void apply(int x0);
    static MemoryAddress allocate(glutVisibilityFunc$callback fi) {
        return RuntimeHelper.upcallStub(glutVisibilityFunc$callback.class, fi, constants$951.glutVisibilityFunc$callback$FUNC, "(I)V");
    }
    static MemoryAddress allocate(glutVisibilityFunc$callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutVisibilityFunc$callback.class, fi, constants$951.glutVisibilityFunc$callback$FUNC, "(I)V", scope);
    }
    static glutVisibilityFunc$callback ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$951.glutVisibilityFunc$callback$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


