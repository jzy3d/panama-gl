// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLBLENDEQUATIONSEPARATEPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLBLENDEQUATIONSEPARATEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONSEPARATEPROC.class, fi, constants$113.PFNGLBLENDEQUATIONSEPARATEPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLBLENDEQUATIONSEPARATEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLBLENDEQUATIONSEPARATEPROC.class, fi, constants$113.PFNGLBLENDEQUATIONSEPARATEPROC$FUNC, "(II)V", scope);
    }
    static PFNGLBLENDEQUATIONSEPARATEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$113.PFNGLBLENDEQUATIONSEPARATEPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


