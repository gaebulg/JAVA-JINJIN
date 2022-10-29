package Java09;

class Cwin{
    static int cnt =0;
    String color;
    int width;
    int height;
    
    Cwin(){
        count();
        color ="red";
        width = 2;
        height =2;
    }
    Cwin(String str,int w,int h){
        count();
        color =str;
        width =w;
        height =h;
    }
    void setZero(int n){
        cnt=0;
    }
    void setValue(int n){
        cnt=n;
    }
    void count(){
        cnt++;
    }
}



