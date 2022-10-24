package Java09;

class CCout{
    static int cnt=0;
    CCout(){
        cnt++;
    }
    void setZero(){
        cnt = 0;
    }
    void setValue(int n){
        cnt = n;
    }
}