import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main2 {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n, r,testCase, xPosition = 0, rock = 0, round = 0;
        int[] x;
        
        testCase = scn.nextInt();

        while(round <= testCase) {
            n = scn.nextInt(); //monster count
            r = scn.nextInt(); //radius
            x = new int[n];    //All monster posit
            for(int i = 0; i < n; i++) {
                //Continue to next input if there're the same
                /* int in = scn.nextInt();
                if(in) */
                //Comment code
                x[i] = scn.nextInt(); //monster 
                xPosition += x[i];
            }

            //Arrays.sort(x);

            for(int i = x.length - 1; xPosition > 0; ) {
                Collections.max(x);
                xPosition -= i; //when catapult shoot
                rock++;
            }
            System.out.println(rock);
            round++;
        }
    }
}
