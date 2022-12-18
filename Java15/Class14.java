package Java15;
class PrePaid extends Thread{
	int sum=200;
	public void talk(int f){
		try{
			sleep((int)(Math.random()*1000));
			sum -=f;
		}
		catch(InterruptedException e){
		}
		System.out.println("the sum is " + sum);
	}
	public void run(){
		while(sum>10){
			int fee=(int)(Math.random()*100);
			talk(fee);
		}
	}
}
public class Class14{
	public static void main(String [] args){
		PrePaid p=new PrePaid();	
		p.start();
	}
}