// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLENDCONDITIONALRENDERPROC {

    void apply();
    static MemoryAddress allocate(PFNGLENDCONDITIONALRENDERPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLENDCONDITIONALRENDERPROC.class, fi, constants$151.PFNGLENDCONDITIONALRENDERPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLENDCONDITIONALRENDERPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLENDCONDITIONALRENDERPROC.class, fi, constants$151.PFNGLENDCONDITIONALRENDERPROC$FUNC, "()V", scope);
    }
    static PFNGLENDCONDITIONALRENDERPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$151.PFNGLENDCONDITIONALRENDERPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

