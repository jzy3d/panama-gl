// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLUNMAPTEXTURE2DINTELPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLUNMAPTEXTURE2DINTELPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLUNMAPTEXTURE2DINTELPROC.class, fi, constants$705.PFNGLUNMAPTEXTURE2DINTELPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLUNMAPTEXTURE2DINTELPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLUNMAPTEXTURE2DINTELPROC.class, fi, constants$705.PFNGLUNMAPTEXTURE2DINTELPROC$FUNC, "(II)V", scope);
    }
    static PFNGLUNMAPTEXTURE2DINTELPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$705.PFNGLUNMAPTEXTURE2DINTELPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

