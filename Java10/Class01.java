package Java10;

class Caaa{
    public int num1;
    public int num2;
}
//cbbb
class Cbbb extends Caaa{
    public void set_num(int jinjin1,int jinjin2){
        num1=jinjin1;
        num2=jinjin2;
    }
    public void show(){
        System.out.printf("%d %d",num1,num2);
    }
}
    public class Class01{
        public static void main(String[] args) {
            Cbbb bb=new Cbbb();
            bb.set_num(5,10);
            bb.show();
        }
    }
