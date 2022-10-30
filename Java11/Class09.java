package Java11;

interface Math {
    void show();
    public void add(int jinjin1,int jinjin2);
    public void sub(int jinjin1,int jinjin2);
    public void mul(int jinjin1,int jinjin2);
    public void div(int jinjin1,int jinjin2);
}
interface AdvancedMath {
    public void mod(int jinjin1, int jinjin2);
    public void fac(int jinjin1);
    public void pow(int jinjin1, int jinjin2);
}
class Compute implements Math, AdvancedMath {
    private int ans = 0;
    public void add(int jinjin1, int jinjin2) {
        ans=jinjin1+jinjin2;
    }
    public void sub(int jinjin1,int jinjin2) {
        ans=jinjin1-jinjin2;
    }
    public void mul(int jinjin1, int jinjin2) {
        ans=jinjin1*jinjin2;
    }
    public void div(int jinjin1, int jinjin2) {
        ans=jinjin1/jinjin2;
    }
    public void mod(int jinjin1, int jinjin2) {
        ans=jinjin1&jinjin2;
    }

    public void fac(int jinjin1) {
        int tmp = 1;
        for (int i = 1; i <= jinjin1; i++) {
            tmp *= i;
        }
        ans = tmp;
    }

    public void pow(int jinjin1, int jinjin2) {
        int tmp = jinjin1;
        for (int i=0; i<jinjin1;i++) {
            tmp*=jinjin1;
        }
        ans=tmp;
    }

    public void show() {
        System.out.println("ans=" +ans);
    }

}

public class Class09 {
    public static void main(String argv[]) {
        Compute cmp = new Compute();
        cmp.mul(3, 5);
        cmp.show();
        cmp.mod(14, 5);
        cmp.show();
        cmp.fac(5);
        cmp.show();
    }
}