import java.io.*;
import java.util.Scanner;

public class Cat {


    public static void main(String args[])

    {
        File file = new File("Text.txt"); // create file textfile.txt
        String absolutePath = file.getAbsolutePath();

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

//        String filePath = absolutePath.substring(0, absolutePath.lastIndexOf(File.separator));
//        System.out.println("File Path : " + filePath);
        while (true) {
            String s;

            Scanner scn = new Scanner(System.in);
            s = scn.nextLine();
            System.out.printf("%s\n", s);
            if (s.equals("exit()")) {
                break;
            }

        }
    }
}