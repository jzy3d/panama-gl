// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLINVALIDATETEXIMAGEPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLINVALIDATETEXIMAGEPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLINVALIDATETEXIMAGEPROC.class, fi, constants$256.PFNGLINVALIDATETEXIMAGEPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLINVALIDATETEXIMAGEPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLINVALIDATETEXIMAGEPROC.class, fi, constants$256.PFNGLINVALIDATETEXIMAGEPROC$FUNC, "(II)V", scope);
    }
    static PFNGLINVALIDATETEXIMAGEPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$256.PFNGLINVALIDATETEXIMAGEPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


