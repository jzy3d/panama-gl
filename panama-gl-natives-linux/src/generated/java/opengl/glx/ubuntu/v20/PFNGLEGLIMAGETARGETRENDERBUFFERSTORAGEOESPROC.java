// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC.class, fi, constants$1014.PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC.class, fi, constants$1014.PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$1015.PFNGLEGLIMAGETARGETRENDERBUFFERSTORAGEOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


