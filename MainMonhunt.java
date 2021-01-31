import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class MainMonhunt {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int n, r,testCase;
        int [] rock;
        ArrayList<Integer> y;
        testCase = scn.nextInt();//2
        rock = new int[testCase];
        for (int round = 0; round < testCase; round++) {
            n = scn.nextInt(); //จน.มอน
            r = scn.nextInt(); //ระยะกระเด็น
            y = new ArrayList<Integer>();    //All monster posit
            for (int i = 0; i < n; i++) y.add(i, scn.nextInt());
            Collections.sort(y);
            while (y.size() > 0) {//รอบ1 j = 1//รอบ2 j = 2
                rock[round]++;
                for (int i = y.size() - 1; i >= 0; i--){//3//2//1//0
                    if (i == 0) {
                        y.remove(i);//
                        break;
                    }
                    else if (y.get(i) == y.get(i - 1)) {//5 == 5//5 == 5//5 == 5
                        y.remove(i);//5 5 5//5 5//5
                    }
                    else {
                        y.remove(i);//
                        break;
                    }
                }
                for (int i = 0; i < y.size(); i++) y.set(i, y.get(i) - r);//ลบค่าทุกตัวออกไป2
                for (int i = 0; i < y.size(); ) if (y.get(i) <= 0) y.remove(i);
            }
        }
        for (int i = 0; i < testCase; i++) System.out.println(rock[i]);
    }
}

