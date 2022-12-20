package Java14.Class06;
import java.io.*;

public class Class06 {
	public static void main(String args[]){
		try {
			String dir=System.getProperty("user.dir");
			FileReader fr = new FileReader("Java14/Class06/train.txt");
			
			char data[]=new char[777];
			
			int num=fr.read(data);
			String str=new String(data,0,num);
			System.out.println("Characters read= "+num);
			System.out.println(str);
			
			fr.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
