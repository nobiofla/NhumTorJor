import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
        double d = sc.nextInt();
        double p;

        if (a/b > c/d) {
            p = a/b;
            System.out.println("Sniper");
            System.out.printf("%1.2f",(1-p));
        }
        else if (a/b < c/d) {
            p = c/d;
            System.out.println("Sling Shooter");
            System.out.printf("%1.2f",(1-p));
        }
        else {
            p = 0;
            System.out.println("NONE");    
            System.out.printf("0");
        }
    }
}
