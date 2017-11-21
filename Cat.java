import java.io.*;

public class Cat {

    static void printFile(BufferedReader src) {
        try {
            int  ch;
//read next character
            while ((ch = src.read()) != -1)
//                write character
                System.out.print((char)ch);
            src.close();
        }
        catch (IOException e) { }
    }

    public static void main(String args[])

    {
        if (args.length < 1)
            // fileName is null, read data from keyboard
            printFile(new BufferedReader(new InputStreamReader(System.in)));
        else {
            for (int i = 1; i < args.length; i++) {
                try {
                    printFile(new BufferedReader(new FileReader(args[i])));
                }
                catch (FileNotFoundException e) {
                    System.err.println("File" + args[i] + "can`t open!");
                }
            }
        }
    }
}
