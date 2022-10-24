package Java09;

class CRational{
    public int n;
    public int d;
    public void setN(int num){
        n=num;
    }
    public void setD(int num){
        d=num;
    }
    public void showND(int num,int den){
        d =den;
        n =num;        
    }
    public void show(){
        System.out.println(n+"/"+d);
    }
}


public class Class10 {
    public static void main(String[] args) {
        CRational jinjin=new CRational();
        jinjin.setN(2);
        jinjin.setD(5);
        jinjin.show();
    }
}
