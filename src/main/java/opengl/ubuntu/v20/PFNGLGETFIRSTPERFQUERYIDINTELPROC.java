// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETFIRSTPERFQUERYIDINTELPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(PFNGLGETFIRSTPERFQUERYIDINTELPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETFIRSTPERFQUERYIDINTELPROC.class, fi, constants$709.PFNGLGETFIRSTPERFQUERYIDINTELPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETFIRSTPERFQUERYIDINTELPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETFIRSTPERFQUERYIDINTELPROC.class, fi, constants$709.PFNGLGETFIRSTPERFQUERYIDINTELPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETFIRSTPERFQUERYIDINTELPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$709.PFNGLGETFIRSTPERFQUERYIDINTELPROC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


