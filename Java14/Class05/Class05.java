package Java14.Class05;
import java.io.*;

public class Class05{
	public static void main(String [] args) throws IOException{
		String dir=System.getProperty("user.dir");
		FileReader fr = new FileReader("Java14/Class05/donkey.txt");
		
		BufferedReader br=new BufferedReader(fr);
		br.readLine();
		String str;
		int txtLength=0;
		
		System.out.print("txt content is \n");
		
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
			txtLength+=str.length();
		}
		
		System.out.println("txt word count = "+txtLength);
	}
}