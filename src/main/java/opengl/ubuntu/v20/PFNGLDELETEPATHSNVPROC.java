// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDELETEPATHSNVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLDELETEPATHSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDELETEPATHSNVPROC.class, fi, constants$786.PFNGLDELETEPATHSNVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLDELETEPATHSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDELETEPATHSNVPROC.class, fi, constants$786.PFNGLDELETEPATHSNVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLDELETEPATHSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$786.PFNGLDELETEPATHSNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


