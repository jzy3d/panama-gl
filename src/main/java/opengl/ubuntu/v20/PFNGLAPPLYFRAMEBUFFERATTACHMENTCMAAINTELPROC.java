// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC {

    void apply();
    static MemoryAddress allocate(PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC.class, fi, constants$705.PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC.class, fi, constants$705.PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC$FUNC, "()V", scope);
    }
    static PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$705.PFNGLAPPLYFRAMEBUFFERATTACHMENTCMAAINTELPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

