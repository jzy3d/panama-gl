// Generated by jextract

package opengl.macos.v11_4;

import static jdk.incubator.foreign.CLinker.C_CHAR;
import static jdk.incubator.foreign.CLinker.C_DOUBLE;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import java.lang.invoke.MethodHandle;
import jdk.incubator.foreign.FunctionDescriptor;
class constants$33 {

    static final FunctionDescriptor glVertexAttrib4NubARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_CHAR,
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle glVertexAttrib4NubARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4NubARB",
        "(IBBBB)V",
        constants$33.glVertexAttrib4NubARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4NubvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4NubvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4NubvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$33.glVertexAttrib4NubvARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4NuivARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4NuivARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4NuivARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$33.glVertexAttrib4NuivARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4NusvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4NusvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4NusvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$33.glVertexAttrib4NusvARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4bvARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle glVertexAttrib4bvARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4bvARB",
        "(ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$33.glVertexAttrib4bvARB$FUNC, false
    );
    static final FunctionDescriptor glVertexAttrib4dARB$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE,
        C_DOUBLE
    );
    static final MethodHandle glVertexAttrib4dARB$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glVertexAttrib4dARB",
        "(IDDDD)V",
        constants$33.glVertexAttrib4dARB$FUNC, false
    );
}


