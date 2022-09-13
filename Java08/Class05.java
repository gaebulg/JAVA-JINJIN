package Java08;
    class CBox{
        int length;
        int width;
        int height;

        int volume() {
            return length * width * height;            
        }
        int surfaceArea(){
            return (length * width + length * height + width * height) * 2;
            
        }
        void showData(){
            System.out.printf("length %d\n" , length);
            System.out.printf("width %d\n",width);
            System.out.printf("height %d\n", height);
        }
        void showAll(){
            System.out.printf("length %d\n" , length);
            System.out.printf("width %d\n" , width);
            System.out.printf("height %d\n" , height);
            System.out.printf("volume %d\n" , volume());
            System.out.printf("surfaceArea %d\n" , surfaceArea());
        }

    }

public class Class05 {
    public static void main(String[] args) {
        CBox box = new CBox();
        box.length = 1;
        box.width = 1;
        box.height = 1;
    }
    
}
