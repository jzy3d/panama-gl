// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC {

    void apply(int x0, float x1, float x2, float x3, float x4, float x5);
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC.class, fi, constants$926.PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC$FUNC, "(IFFFFF)V");
    }
    static MemoryAddress allocate(PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC.class, fi, constants$926.PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC$FUNC, "(IFFFFF)V", scope);
    }
    static PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC ofAddress(MemoryAddress addr) {
        return (int x0, float x1, float x2, float x3, float x4, float x5) -> {
            try {
                constants$926.PFNGLREPLACEMENTCODEUITEXCOORD2FVERTEX3FSUNPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


