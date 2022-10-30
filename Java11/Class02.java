package Java11;
abstract class Math {
    protected int ans;
    public void show() {
        System.out.println("ans = " +ans);
    }
    public abstract void add(int jinjin1, int jinjin2);
    public abstract void sub(int jinjin1, int jinjin2);
    public abstract void mul(int jinjin1, int jinjin2);
    public abstract void div(int jinjin1, int jinjin2);
}
class Compute extends Math {
    public void add(int jinjin1, int jinjin2) {
        ans=jinjin1+jinjin2;
    }
    public void sub(int jinjin1, int jinjin2) {
        ans=jinjin1-jinjin2;
    }
    public void mul(int jinjin1, int jinjin2) {
        ans=jinjin1*jinjin2;
    }
    public void div(int jinjin1, int jinjin2) {
        ans=jinjin1/jinjin2;
    }
}
public class Class02 {
    public static void main(String[] args) {
        Compute cmp=new Compute();
        cmp.mul(3, 5);
        cmp.show();
    }
}