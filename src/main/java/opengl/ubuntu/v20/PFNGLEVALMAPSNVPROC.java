// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLEVALMAPSNVPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLEVALMAPSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLEVALMAPSNVPROC.class, fi, constants$745.PFNGLEVALMAPSNVPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLEVALMAPSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLEVALMAPSNVPROC.class, fi, constants$745.PFNGLEVALMAPSNVPROC$FUNC, "(II)V", scope);
    }
    static PFNGLEVALMAPSNVPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$745.PFNGLEVALMAPSNVPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


