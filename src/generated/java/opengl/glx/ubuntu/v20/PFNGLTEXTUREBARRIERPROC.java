// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTEXTUREBARRIERPROC {

    void apply();
    static MemoryAddress allocate(PFNGLTEXTUREBARRIERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREBARRIERPROC.class, fi, constants$396.PFNGLTEXTUREBARRIERPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLTEXTUREBARRIERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREBARRIERPROC.class, fi, constants$396.PFNGLTEXTUREBARRIERPROC$FUNC, "()V", scope);
    }
    static PFNGLTEXTUREBARRIERPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$396.PFNGLTEXTUREBARRIERPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


