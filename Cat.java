import java.util.Scanner;

public class Cat {
    public static void main(String args[]){
        while(true) {
            String s;

            Scanner scn = new Scanner(System.in);
//            System.out.print("");
            s = scn.nextLine();
            System.out.printf("%s\n", s);
            if(s.equals("exit()")){
                break;
            }

        }
    }
}
