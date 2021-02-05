import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        double p;
        String Elijah;
        if ((double)a/b > (double)c/d) {
            p = (double)a/b;
            Elijah = "Sniper";
        }
        else if ((double)c/d > (double)a/b) {
            p = (double)c/d;
            Elijah = "Sling shooter";
        }
        else {
            p = 0;
            Elijah = "NONE";
        }
        System.out.println(Elijah);
        System.out.printf("%2f",p);
    }
}
