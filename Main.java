import java.util.Scanner;

public class Main {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int a, x , y , z;
        int[] b, c;

        a = scn.nextInt();
        c = new int[a];

        x = scn.nextInt();
        y = scn.nextInt();
        z = scn.nextInt();

        for(int i = 0; i < a; i++) {
            c[i] = scn.nextInt();
        }
    }
    
}