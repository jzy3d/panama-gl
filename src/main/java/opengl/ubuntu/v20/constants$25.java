// Generated by jextract

package opengl.ubuntu.v20;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$25 {

    static final FunctionDescriptor glColor4uiv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glColor4uiv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor4uiv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$25.glColor4uiv$FUNC, false
    );
    static final FunctionDescriptor glColor4usv$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle glColor4usv$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glColor4usv",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$25.glColor4usv$FUNC, false
    );
    static final FunctionDescriptor glTexCoord1d$FUNC = FunctionDescriptor.ofVoid(
        C_DOUBLE
    );
    static final MethodHandle glTexCoord1d$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexCoord1d",
        "(D)V",
        constants$25.glTexCoord1d$FUNC, false
    );
    static final FunctionDescriptor glTexCoord1f$FUNC = FunctionDescriptor.ofVoid(
        C_FLOAT
    );
    static final MethodHandle glTexCoord1f$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexCoord1f",
        "(F)V",
        constants$25.glTexCoord1f$FUNC, false
    );
    static final FunctionDescriptor glTexCoord1i$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle glTexCoord1i$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexCoord1i",
        "(I)V",
        constants$25.glTexCoord1i$FUNC, false
    );
    static final FunctionDescriptor glTexCoord1s$FUNC = FunctionDescriptor.ofVoid(
        C_SHORT
    );
    static final MethodHandle glTexCoord1s$MH = RuntimeHelper.downcallHandle(
        glut_h.LIBRARIES, "glTexCoord1s",
        "(S)V",
        constants$25.glTexCoord1s$FUNC, false
    );
}

