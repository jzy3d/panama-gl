// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLGETNAMEDBUFFERPOINTERVEXTPROC {

    void apply(int x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFNGLGETNAMEDBUFFERPOINTERVEXTPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDBUFFERPOINTERVEXTPROC.class, fi, constants$657.PFNGLGETNAMEDBUFFERPOINTERVEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLGETNAMEDBUFFERPOINTERVEXTPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLGETNAMEDBUFFERPOINTERVEXTPROC.class, fi, constants$657.PFNGLGETNAMEDBUFFERPOINTERVEXTPROC$FUNC, "(IILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLGETNAMEDBUFFERPOINTERVEXTPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$657.PFNGLGETNAMEDBUFFERPOINTERVEXTPROC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


