import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n, r,testCase, xPosition = 0;
        int [] rock;
        ArrayList<Integer> y;

        testCase = scn.nextInt();//2
        rock = new int[testCase];

        //while(round < testCase) {
        for (int round = 0; round < testCase; round++) {
            n = scn.nextInt(); //จน.มอน
            r = scn.nextInt(); //ระยะกระเด็น
            y = new ArrayList<Integer>();    //All monster posit
            for (int i = 0; i < n; i++) y.add(i, scn.nextInt());
            Collections.sort(y);

            while (y.size() > 0) {//รอบ1 j = 1//รอบ2 j = 2
                rock[round]++;
                for (int i = y.size() - 1; i > 0; i--){
                    if (y.get(i) == y.get(i - 1)) {
                        y.remove(i);
                    }
                    else {
                        y.remove(i);
                        break;
                    }
                }
                for (int i = 0; i < y.size(); i++) y.set(i, y.get(i) - r);//ลบค่าทุกตัวออกไป2
                for (int i = 0; i < y.size(); i++) if (y.get(i) <= 0) y.remove(i);
            }
        }
        for (int i = 0; i < testCase; i++) System.out.println(rock[i]);
    }
}
//for (int i = 0; i < y.length; i++) System.out.println(y[i]);
//}

            /*for(int i = 0; i < n; i++) {
                //Continue to next input if there're the same
                /* int in = scn.nextInt();
                if(in)
                //Comment code
                x[i] = scn.nextInt(); //monster
                xPosition += x[i];
            }
             */

//Arrays.sort(x);

            /*for(int i = x.length - 1; xPosition > 0; ) {
                Collections.max(x);
                xPosition -= i; //when catapult shoot
                rock++;
            }
            System.out.println(rock);
            round++;*/
