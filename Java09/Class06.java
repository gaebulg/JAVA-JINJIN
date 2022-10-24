package Java09;

public class Class06 {
    public static int add2n(int n){
        int total=0;
        for(int i=1;i<=n;i++){
            total+=i;
        }
        return total;
}
    public static void main(String[] args) {
        System.out.println(add2n(10));
    }
}
