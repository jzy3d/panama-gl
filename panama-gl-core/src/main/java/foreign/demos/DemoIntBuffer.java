package foreign.demos;

import static jdk.incubator.foreign.ResourceScope.newImplicitScope;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.MemoryHandles;
import jdk.incubator.foreign.MemorySegment;

// -XstartOnFirstThread --enable-native-access=ALL-UNNAMED --add-modules jdk.incubator.foreign
public class DemoIntBuffer {
    public static void main(String[] args){
        MemorySegment colorTex = MemorySegment.allocateNative(100, newImplicitScope());
        VarHandle intHandle = MemoryHandles.varHandle(int.class, ByteOrder.nativeOrder());
        for (int i = 0; i < 25; i++) {
            intHandle.set(colorTex, /* offset */ i * 4, /* value to write */ i);
        }

        for (int i = 0; i < 25; i++) {
            byte[] integer = new byte[4];
            //integer[0] = (byte)intHandle.get(colorTex, /* offset */ i * 4);
            //integer[1] = (byte)intHandle.get(colorTex, /* offset */ i * 4 + 1);
            //integer[2] = (byte)intHandle.get(colorTex, /* offset */ i * 4 + 2);
            //integer[3] = (byte)intHandle.get(colorTex, /* offset */ i * 4 + 3);
            //IntBuffer.wra

            System.out.println(intHandle.get(colorTex, /* offset */ i * 4));
        }
    }
}
