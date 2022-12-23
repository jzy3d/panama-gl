package opengl;

/**
 * A ByteBuffer helping to convert colors to byte, int, float representation.
 * 
 * @author Martin Pernollet
 */
public class ByteUtils {
    public static int BtoI(byte x) {
        return (x & 0xff);
    }

    public static int StoI(short x) {
        return (x & 0xffff);
    }

    public static int FtoI(float x) {
        return (int) (x * 255.0f);
    }

    public static float BtoF(byte x) {
        return (float) (x & 0xff) / 255.0f;
    }

    public static float ItoF(int x) {
        return (float) x / 255.0f;
    }

    public static int ItoR(int x) {
        return ((x & 0x00ff0000) >> 16);
    }

    public static int ItoG(int x) {
        return ((x & 0x0000ff00) >> 8);
    }

    public static int ItoB(int x) {
        return (x & 0x000000ff);
    }

    public static int ItoA(int x) {
        return (((x & 0xff000000) >> 24) & 0x000000ff);
    }

    public static int RGBAtoIntARGB(byte r, byte g, byte b, byte a) {
        return (  ((a & 0xff) << 24)
                | ((r & 0xff) << 16)
                | ((g & 0xff) << 8)
                | ((b & 0xff) << 0)
        );
    }

    /*public static int RGBAtoIntARGB(byte r, byte g, byte b, byte a) {
        return (  ((a & 0xff) << 24)
                | (((r & 0xff) << 16) & 0x00ff0000)
                | (((g & 0xff) << 8) & 0x0000ff00)
                | ((b & 0xff) & 0x000000ff)
        );
    }*/

    public static int RGBAtoIntARGB(int r, int g, int b, int a) {
        return ((a << 24) | (r << 16) | (g << 8) | b);
    }

    public static int RGBAtoIntARGB(float r, float g, float b, float a) {
        return RGBAtoIntARGB(FtoI(r), FtoI(g), FtoI(b), FtoI(a));
    }


    public static int[] IntARGBtoRGBAi(int i) {
        int rgb[] = new int[4];
        rgb[0] = (i & 0x00ff0000) >> 16;
        rgb[1] = (i & 0x0000ff00) >> 8;
        rgb[2] = (i & 0x000000ff);
        rgb[3] = ((i & 0xff000000) >> 24) & 0x000000ff;
        return rgb;
    }

    public static float[] IntARGBtoRGBAf(int i) {
        float rgb[] = new float[4];
        rgb[0] = ItoF((i & 0x00ff0000) >> 16);
        rgb[1] = ItoF((i & 0x0000ff00) >> 8);
        rgb[2] = ItoF((i & 0x000000ff));
        rgb[3] = ItoF(((i & 0xff000000) >> 24) & 0x000000ff);
        return rgb;
    }

    public static int[] IntARGBtoRGBi(int i) {
        int rgb[] = new int[3];
        rgb[0] = (i & 0x00ff0000) >> 16;
        rgb[1] = (i & 0x0000ff00) >> 8;
        rgb[2] = (i & 0x000000ff);
        return rgb;
    }

    public static float[] ItoRGBf(int i) {
        float rgb[] = new float[3];
        rgb[0] = ItoF((i & 0x00ff0000) >> 16);
        rgb[1] = ItoF((i & 0x0000ff00) >> 8);
        rgb[2] = ItoF((i & 0x000000ff));
        return rgb;
    }

}
