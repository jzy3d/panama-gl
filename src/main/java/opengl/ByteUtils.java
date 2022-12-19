package opengl;

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

    public static int RGBAtoI(byte r, byte g, byte b, byte a) {
        return (((a & 0xff) << 24) | ((r & 0xff) << 16) | ((g & 0xff) << 8) | b);
    }

    public static int RGBAtoI(int r, int g, int b, int a) {
        return ((a << 24) | (r << 16) | (g << 8) | b);
    }

    public static int RGBAtoI(float r, float g, float b, float a) {
        return RGBAtoI(FtoI(r), FtoI(g), FtoI(b), FtoI(a));
    }

}
