// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLINVALIDATEBUFFERDATAPROC {

    void apply(int x0);
    static MemoryAddress allocate(PFNGLINVALIDATEBUFFERDATAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLINVALIDATEBUFFERDATAPROC.class, fi, constants$256.PFNGLINVALIDATEBUFFERDATAPROC$FUNC, "(I)V");
    }
    static MemoryAddress allocate(PFNGLINVALIDATEBUFFERDATAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLINVALIDATEBUFFERDATAPROC.class, fi, constants$256.PFNGLINVALIDATEBUFFERDATAPROC$FUNC, "(I)V", scope);
    }
    static PFNGLINVALIDATEBUFFERDATAPROC ofAddress(MemoryAddress addr) {
        return (int x0) -> {
            try {
                constants$256.PFNGLINVALIDATEBUFFERDATAPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


