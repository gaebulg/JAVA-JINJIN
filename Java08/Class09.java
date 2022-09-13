package Java08;
class CCalculator{
    int a;
    int b;
    int c;

    void set_value(int x,int y ,int z){
        a=x;
        b=y;
        c=z;
    }
    void show(){
        System.out.println(a +" "+ b + " " + c +" ");
    }
    int add(){
        return a+b+c;
    }
    int sub(){
        return a-b-c;
    }
    int mul(){
        return a*b*c;
    }
    double avg(){
        return ((double)a+(double)b+(double)c)/3;
    }
}

public class Class09 {
    public static void main(String[] args) {
        CCalculator obj = new CCalculator();
        obj.set_value(25, 3, 7);
        
    }
    
}
