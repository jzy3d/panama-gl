// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLTEXTUREBARRIERNVPROC {

    void apply();
    static MemoryAddress allocate(PFNGLTEXTUREBARRIERNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREBARRIERNVPROC.class, fi, constants$911.PFNGLTEXTUREBARRIERNVPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLTEXTUREBARRIERNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREBARRIERNVPROC.class, fi, constants$911.PFNGLTEXTUREBARRIERNVPROC$FUNC, "()V", scope);
    }
    static PFNGLTEXTUREBARRIERNVPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$911.PFNGLTEXTUREBARRIERNVPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


