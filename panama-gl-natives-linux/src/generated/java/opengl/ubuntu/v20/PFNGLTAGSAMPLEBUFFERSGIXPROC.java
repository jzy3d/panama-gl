// Generated by jextract

package opengl.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTAGSAMPLEBUFFERSGIXPROC {

    void apply();
    static MemoryAddress allocate(PFNGLTAGSAMPLEBUFFERSGIXPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTAGSAMPLEBUFFERSGIXPROC.class, fi, constants$907.PFNGLTAGSAMPLEBUFFERSGIXPROC$FUNC, "()V");
    }
    static MemoryAddress allocate(PFNGLTAGSAMPLEBUFFERSGIXPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTAGSAMPLEBUFFERSGIXPROC.class, fi, constants$907.PFNGLTAGSAMPLEBUFFERSGIXPROC$FUNC, "()V", scope);
    }
    static PFNGLTAGSAMPLEBUFFERSGIXPROC ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                constants$907.PFNGLTAGSAMPLEBUFFERSGIXPROC$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}

