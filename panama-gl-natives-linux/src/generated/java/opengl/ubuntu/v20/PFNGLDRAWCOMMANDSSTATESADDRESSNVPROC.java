// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, int x4);
    static MemoryAddress allocate(PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC.class, fi, constants$735.PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC.class, fi, constants$735.PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, int x4) -> {
            try {
                constants$735.PFNGLDRAWCOMMANDSSTATESADDRESSNVPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


