


import java.io.*;

public class Cat {

    static void printFile(BufferedReader src) {
        try {
            String currentline;
//read next character
            while ((currentline = src.readLine()) != null)
//write character
                System.out.println(currentline);
            src.close();
        } catch (IOException e) {
        }
    }

    static void printFileOpt(File fileName) throws FileNotFoundException {


        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(fileName));
        try {
//read next character
            while (lineNumberReader.readLine() != null)
                System.out.println(lineNumberReader.getLineNumber() + "\t" + bufferedReader.readLine());
//write character
//            System.out.println(currentline);
            bufferedReader.close();
            lineNumberReader.close();
        } catch (IOException e) {
        }
    }

    public static void main(String args[])

    {
        boolean opt = false;
        if (args.length < 1)
            // fileName is null, read data from input
            printFile(new BufferedReader(new InputStreamReader(System.in)));
        else {
            for (int i = 0; i < args.length; i++) {

                if (args[i].equals("cat")) {
                    continue;
                }
                if (args[i].equals("-n")) {
                    opt = true;
                    continue;
                }
                try {
                    File file = new File(args[i]);
                    System.out.println(file.getAbsolutePath());
                    if (opt) {
                        printFileOpt(file);
                    } else {
                        printFile(new BufferedReader(new FileReader(args[i])));
                    }
                } catch (FileNotFoundException e) {
                    System.err.println("File " + args[i] + "can`t open!");
                }

            }
        }
    }
}
