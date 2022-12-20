package Java14.Class04;
import java.io.*;

public class Class04 {
	public static void main(String [] args) throws IOException{
		String dir=System.getProperty("user.dir");
		FileReader fr = new FileReader("Java14/Class04/donkey.txt");
		
		char data[]=new char[777];
		int txtLength=fr.read(data);
		String str=new String(data,0,txtLength);
		
		System.out.println("txt word count = "+txtLength);
		System.out.println("txt content is \n"+str);
	}
}