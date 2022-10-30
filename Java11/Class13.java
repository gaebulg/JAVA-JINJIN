package Java11;

interface Show_ans {
    public void show();
}
interface Math extends Show_ans {
    public void add(int jinjin1, int jinjin2);
    public void sub(int jinjin1, int jinjin2);
    public void mul(int jinjin1, int jinjin2);
    public void div(int jinjin1, int jinjin2);
}
class Computer implements Math {
    private int ans;
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
    public void show() {
        System.out.println("ans = " + ans);
    }
}
public class Class13 {
    public static void main(String[] args) {
        Computer cmp = new Computer();
        cmp.mul(3, 5);
        cmp.show();
    }
}