package Java10;

class Caaa{
    private int num;

    public Caaa(int n){
        num=n;
    }
    public int get(){
        return num;
    }
    void display(){
        System.out.println("printed from Caaa class");
    }
}

class Cbbb extends Caaa{
    public Cbbb(int n){
        super(n);
    }
    public void show(){
        System.out.println("num="+get());
    }
    @Override
    void display(){
        System.out.println("print from Cbbb class");
    }
}
public class Class09{
    public static void main(String[] args) {
        Cbbb bb=new Cbbb(2);
        bb.show();
    }
}