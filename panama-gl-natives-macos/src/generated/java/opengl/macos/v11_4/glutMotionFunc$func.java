// Generated by jextract

package opengl.macos.v11_4;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface glutMotionFunc$func {

    void apply(int x0, int x1);
    static MemoryAddress allocate(glutMotionFunc$func fi) {
        return RuntimeHelper.upcallStub(glutMotionFunc$func.class, fi, constants$186.glutMotionFunc$func$FUNC, "(II)V");
    }
    static MemoryAddress allocate(glutMotionFunc$func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutMotionFunc$func.class, fi, constants$186.glutMotionFunc$func$FUNC, "(II)V", scope);
    }
    static glutMotionFunc$func ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$187.glutMotionFunc$func$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


