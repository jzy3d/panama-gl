// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface glutDialsFunc$callback {

    void apply(int x0, int x1);
    static MemoryAddress allocate(glutDialsFunc$callback fi) {
        return RuntimeHelper.upcallStub(glutDialsFunc$callback.class, fi, constants$960.glutDialsFunc$callback$FUNC, "(II)V");
    }
    static MemoryAddress allocate(glutDialsFunc$callback fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutDialsFunc$callback.class, fi, constants$960.glutDialsFunc$callback$FUNC, "(II)V", scope);
    }
    static glutDialsFunc$callback ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$960.glutDialsFunc$callback$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


