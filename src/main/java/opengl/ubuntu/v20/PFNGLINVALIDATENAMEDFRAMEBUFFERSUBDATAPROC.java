// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, int x5, int x6);
    static MemoryAddress allocate(PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC.class, fi, constants$280.PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;IIII)V");
    }
    static MemoryAddress allocate(PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC.class, fi, constants$280.PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;IIII)V", scope);
    }
    static PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, int x4, int x5, int x6) -> {
            try {
                constants$280.PFNGLINVALIDATENAMEDFRAMEBUFFERSUBDATAPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5, x6);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


