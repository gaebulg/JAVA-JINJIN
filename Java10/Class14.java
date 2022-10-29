package Java10;
class Caaa{
    public int num1,num2;

    public Caaa(){
        num1=1;
        num2=1;
    }
    public Caaa(int x,int y){
        num1=x;
        num2=y;
    }
}
class Cbbb extends Caaa{
    public void set_num(int x,int y){
        num1=x;
        num2=y;
    }
    public void show(){
        System.out.printf("%d %d",num1,num2);
    }
    public Cbbb(){
        super();
    }
    public Cbbb(int x,int y){
        super(x,y);
    }
}
public class Class14 {
    public static void main(String[] args){
        Cbbb bb=new Cbbb(5,10);
        bb.show();
    }
}
