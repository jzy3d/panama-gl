// Generated by jextract

package opengl.glx.ubuntu.v20;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;
public interface PFNGLEGLIMAGETARGETTEXTURE2DOESPROC {

    void apply(int x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PFNGLEGLIMAGETARGETTEXTURE2DOESPROC fi) {
        return RuntimeHelper.upcallStub(PFNGLEGLIMAGETARGETTEXTURE2DOESPROC.class, fi, constants$1014.PFNGLEGLIMAGETARGETTEXTURE2DOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFNGLEGLIMAGETARGETTEXTURE2DOESPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFNGLEGLIMAGETARGETTEXTURE2DOESPROC.class, fi, constants$1014.PFNGLEGLIMAGETARGETTEXTURE2DOESPROC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFNGLEGLIMAGETARGETTEXTURE2DOESPROC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$1014.PFNGLEGLIMAGETARGETTEXTURE2DOESPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


