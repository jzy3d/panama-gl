// Generated by jextract

package opengl.glx.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$923 {

    static final FunctionDescriptor PFNGLVDPAUMAPSURFACESNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVDPAUMAPSURFACESNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$923.PFNGLVDPAUMAPSURFACESNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVDPAUUNMAPSURFACESNVPROC$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle PFNGLVDPAUUNMAPSURFACESNVPROC$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$923.PFNGLVDPAUUNMAPSURFACESNVPROC$FUNC, false
    );
    static final FunctionDescriptor PFNGLVDPAUREGISTERVIDEOSURFACEWITHPICTURESTRUCTURENVPROC$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER,
        C_CHAR
    );
    static final MethodHandle PFNGLVDPAUREGISTERVIDEOSURFACEWITHPICTURESTRUCTURENVPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;B)J",
        constants$923.PFNGLVDPAUREGISTERVIDEOSURFACEWITHPICTURESTRUCTURENVPROC$FUNC, false
    );
}


