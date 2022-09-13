package Java08;
public class Class02 {
    double x;
    double y;
    public static void main(String[] args) {
        Class02 obj1=new Class02();
        obj1.x=5.2;
        obj1.y=3.9;
        Class02 obj2=new Class02();
        obj2.x=6.5;
        obj2.y=4.6;
        Class02 avg=new Class02();
        avg.x=(obj1.x+obj2.x)/2;
        avg.y=(obj1.y+obj2.y)/2;
        System.out.println("obj1.x="+obj1.x+" obj.y1="+obj1.y);
        System.out.println("obj2.x="+obj2.x+" obj.y2="+obj2.y);
        System.out.println("avg.x="+avg.x+" avg.y="+avg.y);
        
    }
}
