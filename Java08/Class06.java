package Java08;
class CCircle{
    double pi=3.14;
    double radius;

    void show_periphery(){
        System.out.println("periphery="+2*this.pi*this.radius);
    }
}


public class Class06 {
    public static void main(String[] args) {
        CCircle cirl=new CCircle();
        cirl.radius=3.0;
        cirl.show_periphery();
        
    }
    
}