import java.io.*;

public class Cat {

    static void printFile(BufferedReader src) {
        try {
            String  currentline;
//read next character
            while ((currentline = src.readLine()) != null)
//write character
                System.out.println(currentline);
            src.close();
        }
        catch (IOException e) { }
    }

    public static void main(String args[])

    {
        if (args.length < 1)
            // fileName is null, read data from input
            printFile(new BufferedReader(new InputStreamReader(System.in)));
        else {
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("cat")){
                    continue;
                }
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
