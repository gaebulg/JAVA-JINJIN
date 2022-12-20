package Java14.Class07;

import java.io.*;

public class Class07 {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("Java14/Class07/train.txt");
        BufferedReader br = new BufferedReader(fr);
        String str;
        int count = 0;
        int strLength = 0;
        System.out.print("txt content is \n");

        while ((str = br.readLine()) != null) {
            if (count == 1) {
                br.skip(13);
            }
            System.out.println(str);
            strLength += str.length();
            count++;
        }

        System.out.println("txt word count = " + strLength);
    }
}