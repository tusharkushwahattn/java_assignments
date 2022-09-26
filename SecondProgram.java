import java.util.Scanner;

public class SecondProgram {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String st;
            String re = " ";
            do {
                st = sc.next();
                re = re + " " + st;
            } while (!st.equals("XDONE"));
            System.out.println(re);
        }
    }
}