package foreign.demos;

import static jdk.incubator.foreign.ResourceScope.newImplicitScope;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemorySegment;

// -XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign
public class DemoFloatBuffer {
    public static void main(String[] args){
        MemorySegment colorTex = MemorySegment.allocateNative(100, newImplicitScope());
        VarHandle floatHandle = MemoryHandles.varHandle(float.class, ByteOrder.nativeOrder());
        for (int i = 0; i < 25; i++) {
            floatHandle.set(colorTex, /* offset */ i * 4, /* value to write */ i/10f);
        }

        for (int i = 0; i < 25; i++) {
            System.out.println(floatHandle.get(colorTex, /* offset */ i * 4));
        }
    }
}
