// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface XIOErrorHandler {

    int apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(XIOErrorHandler fi) {
        return RuntimeHelper.upcallStub(XIOErrorHandler.class, fi, constants$17.XIOErrorHandler$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(XIOErrorHandler fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(XIOErrorHandler.class, fi, constants$17.XIOErrorHandler$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static XIOErrorHandler ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                return (int)constants$18.XIOErrorHandler$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


