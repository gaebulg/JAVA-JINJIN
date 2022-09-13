package Java08;

class Ctest{
   void test(int jinjin){
    if(jinjin == 0){
    System.out.println("此數為0");
    }else if (jinjin % 2 == 0){
        System.out.println("此數為偶數");
    }else{
        System.out.println("此數為奇數");
    }
   }
}

public class Class07 {
    public static void main(String[] args) {
        Ctest t =new Ctest();
        t.test(3);
        t.test(8);
        t.test(0);
    }
    
}
