// Generated by jextract

package opengl.ubuntu.v20;

import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$74 {

    static final FunctionDescriptor PFNGLGETCOMPRESSEDTEXIMAGEPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLGETCOMPRESSEDTEXIMAGEPROC$MH = RuntimeHelper.downcallHandle(
        "(IILjdk/incubator/foreign/MemoryAddress;)V",
        constants$74.PFNGLGETCOMPRESSEDTEXIMAGEPROC$FUNC, false
    );
    static final FunctionDescriptor glActiveTextureARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glActiveTextureARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glActiveTextureARB",
        "(I)V",
        constants$74.glActiveTextureARB$FUNC, false
    );
    static final FunctionDescriptor glClientActiveTextureARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glClientActiveTextureARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glClientActiveTextureARB",
        "(I)V",
        constants$74.glClientActiveTextureARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord1dARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE
    );
    static final MethodHandle glMultiTexCoord1dARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord1dARB",
        "(ID)V",
        constants$74.glMultiTexCoord1dARB$FUNC, false
    );
    static final FunctionDescriptor glMultiTexCoord1dvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glMultiTexCoord1dvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glMultiTexCoord1dvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$74.glMultiTexCoord1dvARB$FUNC, false
    );
}

