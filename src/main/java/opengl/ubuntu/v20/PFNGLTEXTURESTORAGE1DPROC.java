// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTEXTURESTORAGE1DPROC {

    void apply(int x0, int x1, int x2, int x3);
    static MemoryAddress allocate(PFNGLTEXTURESTORAGE1DPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE1DPROC.class, fi, constants$286.PFNGLTEXTURESTORAGE1DPROC$FUNC, "(IIII)V");
    }
    static MemoryAddress allocate(PFNGLTEXTURESTORAGE1DPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTURESTORAGE1DPROC.class, fi, constants$286.PFNGLTEXTURESTORAGE1DPROC$FUNC, "(IIII)V", scope);
    }
    static PFNGLTEXTURESTORAGE1DPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, int x3) -> {
            try {
                constants$286.PFNGLTEXTURESTORAGE1DPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

