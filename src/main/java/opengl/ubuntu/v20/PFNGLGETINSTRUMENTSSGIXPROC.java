// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETINSTRUMENTSSGIXPROC {

    int apply();
    static MemoryAddress allocate(PFNGLGETINSTRUMENTSSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETINSTRUMENTSSGIXPROC.class, fi, constants$899.PFNGLGETINSTRUMENTSSGIXPROC$FUNC, "()I");
    }
    static MemoryAddress allocate(PFNGLGETINSTRUMENTSSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETINSTRUMENTSSGIXPROC.class, fi, constants$899.PFNGLGETINSTRUMENTSSGIXPROC$FUNC, "()I", scope);
    }
    static PFNGLGETINSTRUMENTSSGIXPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                return (int)constants$899.PFNGLGETINSTRUMENTSSGIXPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

