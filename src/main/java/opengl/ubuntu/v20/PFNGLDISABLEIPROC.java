// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLDISABLEIPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLDISABLEIPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDISABLEIPROC.class, fi, constants$147.PFNGLDISABLEIPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLDISABLEIPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDISABLEIPROC.class, fi, constants$147.PFNGLDISABLEIPROC$FUNC, "(II)V", scope);
    }
    static PFNGLDISABLEIPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$147.PFNGLDISABLEIPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


