// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLTEXTUREMATERIALEXTPROC {

    void apply(int x0, int x1);
    static MemoryAddress allocate(PFNGLTEXTUREMATERIALEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREMATERIALEXTPROC.class, fi, constants$725.PFNGLTEXTUREMATERIALEXTPROC$FUNC, "(II)V");
    }
    static MemoryAddress allocate(PFNGLTEXTUREMATERIALEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLTEXTUREMATERIALEXTPROC.class, fi, constants$725.PFNGLTEXTUREMATERIALEXTPROC$FUNC, "(II)V", scope);
    }
    static PFNGLTEXTUREMATERIALEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1) -> {
            try {
                constants$725.PFNGLTEXTUREMATERIALEXTPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


