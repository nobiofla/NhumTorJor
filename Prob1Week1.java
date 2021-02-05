import java.util.Scanner;
import java.util.Arrays;

public class Prob1Week1 {
    public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);
        int in1 = sc.nextInt();
        int odd = 0, even = 0;

        int[] a = new int[in1];

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if(a[i] % 2 == 0) even++;
            else odd++;
        }

        //sort
        Arrays.sort(a);

        //process
        int out = 0;    int stop = 0;
        if(odd - even > 1) {
            int nPull = odd - even -1;
            for(int i = 0; nPull != stop; i++) {
                if(a[i] % 2 != 0) {     //for odd
                    out += a[i];
                    stop++;
                }
            }
            System.out.println(out);
        } else if(even - odd > 1) {
            int nPull = even - odd -1;
            for(int i = 0; nPull != stop; i++) {
                if(a[i] % 2 == 0) {     //for even
                    out += a[i];
                    stop++;
                }
            }
            System.out.println(out);
        } else System.out.println(0);
    }
}