// Generated by jextract

package opengl.macos.v10_15_3;

import jdk.incubator.foreign.*;

public interface glutEntryFunc$func {

    void apply(int x0);
    static MemoryAddress allocate(glutEntryFunc$func fi) {
        return RuntimeHelper.upcallStub(glutEntryFunc$func.class, fi, constants$187.glutEntryFunc$func$FUNC, "(I)V");
    }
    static MemoryAddress allocate(glutEntryFunc$func fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(glutEntryFunc$func.class, fi, constants$187.glutEntryFunc$func$FUNC, "(I)V", scope);
    }
    static glutEntryFunc$func ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$188.glutEntryFunc$func$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

