// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLENDCONDITIONALRENDERNVXPROC {

    void apply();
    static MemoryAddress allocate(PFNGLENDCONDITIONALRENDERNVXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLENDCONDITIONALRENDERNVXPROC.class, fi, constants$805.PFNGLENDCONDITIONALRENDERNVXPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLENDCONDITIONALRENDERNVXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLENDCONDITIONALRENDERNVXPROC.class, fi, constants$805.PFNGLENDCONDITIONALRENDERNVXPROC$FUNC, "()V", scope);
    }
    static PFNGLENDCONDITIONALRENDERNVXPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$805.PFNGLENDCONDITIONALRENDERNVXPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

