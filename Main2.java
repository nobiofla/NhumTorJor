import java.util.Scanner;
import java.util.Arrays;

public class Main2 {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n, r,testCase, checkNum, xPosition = 0, rock = 0, round = 0;
        int[] x;
        
        testCase = scn.nextInt();

        while(round <= testCase) {
            n = scn.nextInt(); //monster count
            r = scn.nextInt(); //radius
            x = new int[n];    //All monster position

            for(int i = 0; i < n; i++) {
                x[i] = scn.nextInt(); //monster 
                xPosition += x[i];
            }

            Arrays.sort(x);

            for(int i = 0; i < x.length; i++) { //find the same element(number/monster position)
                for (int j = i + 1; j < x.length; j++) {
                   if(x[i] == x[j]) {
                        xPosition -= x[i];
                        x[i] = 0;
                   }
                }
             }

            for(int i = x.length - 1; xPosition > 0; i--) {
                xPosition -= (i); //when catapult shoot
                x[i] = 0;

                //xPosition -= r;
                
                rock++;
            }
            System.out.println(rock);
            round++;
        }
    }
}
