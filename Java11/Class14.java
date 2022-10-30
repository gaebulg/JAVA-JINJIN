package Java11;

interface iVolume {
    public void showData();
    public double vol();
}
abstract class CSphere implements iVolume {
    final double PI = 3.14;
    protected int jinjin1;
    protected int jinjin2;
}
class CCircle1 extends CSphere {
    protected int radius;
    public CCircle1(int a, int b, int r) {
        jinjin1 = a;
        jinjin2 = b;
        radius = r;
    }
    public void showData() {
        System.out.printf("球心: (%d, %d)\n", jinjin1, jinjin2);
        System.out.println("半徑: " + radius);
        System.out.printf("球體積: %.2f\n", vol());
    }
    public double vol() {
        return ((4.0 / 3) * PI * radius * radius * radius);
    }
}
public class Class14 {
    public static void main(String[] args) {
        CCircle1 cir = new CCircle1(8, 6, 2);
        cir.showData();
    }
}