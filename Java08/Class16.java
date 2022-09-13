package Java08;
class CSphere{
    private int x;
    private int y;
    private int z;
    private int radius;
    private double pi=3.14;
    
    void setLocation(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    void setRadius(int radius){
        this.radius=radius;
    }
    double surfaceArea(){
        return radius*radius*pi*4;
    }
    double volume(){
        return radius*radius*radius*pi*4/3;
    }
    void showCenter(){
        System.out.printf("%d %d %d\n",x,y,z);
    }
}

public class Class16 {
    public static void main(String[] args) {
        CSphere jinjin=new CSphere();
        jinjin.setLocation(3, 4, 5);
        jinjin.setRadius(1);
    }
    
}
