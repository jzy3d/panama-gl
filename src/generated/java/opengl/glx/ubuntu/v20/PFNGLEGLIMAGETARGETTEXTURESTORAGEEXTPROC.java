// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC.class, fi, constants$601.PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC.class, fi, constants$601.PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$601.PFNGLEGLIMAGETARGETTEXTURESTORAGEEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


