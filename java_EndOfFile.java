import java.io.*;
import java.util.*;

public class java_EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int inc = 0;
        while (scan.hasNext()) {
            inc++;
            System.out.println(inc + " " + scan.nextLine());
        }
        scan.close();
    }
}
