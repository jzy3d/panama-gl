// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTRANSLATEXOESPROC {

    void apply(int x0, int x1, int x2);
    static MemoryAddress allocate(PFNGLTRANSLATEXOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTRANSLATEXOESPROC.class, fi, constants$425.PFNGLTRANSLATEXOESPROC$FUNC, "(III)V");
    }
    static MemoryAddress allocate(PFNGLTRANSLATEXOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTRANSLATEXOESPROC.class, fi, constants$425.PFNGLTRANSLATEXOESPROC$FUNC, "(III)V", scope);
    }
    static PFNGLTRANSLATEXOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2) -> {
            try {
                constants$425.PFNGLTRANSLATEXOESPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

