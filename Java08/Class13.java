package Java08;
class CCircle{
    double pi =3.14;

    double area(double r){
        return r * r * pi;
    }
    float area(float r){
        return (float)r * (float)r * (float)pi;
    }
    double area(int r){
        return (double)r * (double)r * (double)pi;
    }
    
}

public class Class13 {
    public static void main(String[] args) {
        CCircle jinjin= new CCircle();
        System.out.println(jinjin.area(2));
        System.out.println(jinjin.area(2.2f));
        System.out.println(jinjin.area(2.2));
        
    }
}
