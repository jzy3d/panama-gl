// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLDRAWELEMENTSINSTANCEDARBPROC {

    void apply(int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, int x4);
    static MemoryAddress allocate(PFNGLDRAWELEMENTSINSTANCEDARBPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLDRAWELEMENTSINSTANCEDARBPROC.class, fi, constants$408.PFNGLDRAWELEMENTSINSTANCEDARBPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;I)V");
    }
    static MemoryAddress allocate(PFNGLDRAWELEMENTSINSTANCEDARBPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLDRAWELEMENTSINSTANCEDARBPROC.class, fi, constants$408.PFNGLDRAWELEMENTSINSTANCEDARBPROC$FUNC, "(IIILjdk/incubator/foreign/MemoryAddress;I)V", scope);
    }
    static PFNGLDRAWELEMENTSINSTANCEDARBPROC ofAddress(MemoryAddress addr) {
        return (int x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3, int x4) -> {
            try {
                constants$408.PFNGLDRAWELEMENTSINSTANCEDARBPROC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


