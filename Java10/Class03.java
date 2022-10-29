package Java10;

class Caaa{
    public int num1;
    public int num2;
    
    public Caaa(){
        num1=1;
        num2=1;
    }
    public Caaa(int jinjin1,int jinjin2){
        num1=jinjin1;
        num2=jinjin2;
    }
}
class Cbbb extends Caaa{
    public void set_num(int jinjin1,int jinjin2){
        num1=jinjin1;
        num2=jinjin2;
    }
    public void show(){
        System.out.printf("%d %d",num1,num2);
    }
    public Cbbb(int jinjin1,int jinjin2){
        super(jinjin1,jinjin2);
    }
}
public class Class03{
    public static void main(String[] args) {
        Cbbb bb =new Cbbb(5,10);
        bb.show();
    }
}


