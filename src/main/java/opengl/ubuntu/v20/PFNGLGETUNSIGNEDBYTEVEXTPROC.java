// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLGETUNSIGNEDBYTEVEXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLGETUNSIGNEDBYTEVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETUNSIGNEDBYTEVEXTPROC.class, fi, constants$640.PFNGLGETUNSIGNEDBYTEVEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETUNSIGNEDBYTEVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETUNSIGNEDBYTEVEXTPROC.class, fi, constants$640.PFNGLGETUNSIGNEDBYTEVEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETUNSIGNEDBYTEVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$640.PFNGLGETUNSIGNEDBYTEVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

