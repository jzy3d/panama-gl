// Generated by jextract

package opengl.macos.v10_15_3;

import jdk.incubator.foreign.*;

public interface gluNurbsCallback$CallBackFunc {

    void apply();
    static MemoryAddress allocate(gluNurbsCallback$CallBackFunc fi) {
        return RuntimeHelper.upcallStub(gluNurbsCallback$CallBackFunc.class, fi, constants$169.gluNurbsCallback$CallBackFunc$FUNC, "()V");
    }
    static MemoryAddress allocate(gluNurbsCallback$CallBackFunc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(gluNurbsCallback$CallBackFunc.class, fi, constants$169.gluNurbsCallback$CallBackFunc$FUNC, "()V", scope);
    }
    static gluNurbsCallback$CallBackFunc ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$169.gluNurbsCallback$CallBackFunc$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


