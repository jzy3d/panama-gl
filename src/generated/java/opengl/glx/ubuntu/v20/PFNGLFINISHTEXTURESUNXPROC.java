// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLFINISHTEXTURESUNXPROC {

    void apply();
    static MemoryAddress allocate(PFNGLFINISHTEXTURESUNXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLFINISHTEXTURESUNXPROC.class, fi, constants$995.PFNGLFINISHTEXTURESUNXPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLFINISHTEXTURESUNXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLFINISHTEXTURESUNXPROC.class, fi, constants$995.PFNGLFINISHTEXTURESUNXPROC$FUNC, "()V", scope);
    }
    static PFNGLFINISHTEXTURESUNXPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$995.PFNGLFINISHTEXTURESUNXPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


