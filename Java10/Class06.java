package Java10;
class CTriangle{
    protected int base;
    protected int height;
    protected void show(){
        System.out.println("base="+base+",height="+height);
    }
}
class CData extends CTriangle{
    CData(int jinjin1,int jinjin2){
        base=jinjin1;
        height=jinjin2;
    }
    public double area(){
        return base*height/2;
    }
    @Override
    protected void show(){
        System.out.println("base="+base+",height="+height+",area="+area());
    }
}
public class Class06 {
    public static void main(String[] args) {
        CData obj=new CData(3,8);
        obj.show();
    }
    
}
