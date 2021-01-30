import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scn.nextInt();
        int x = scn.nextInt();
        ArrayList<Integer> xlist = new ArrayList<Integer>();
        int y = scn.nextInt();
        ArrayList<Integer> ylist = new ArrayList<Integer>();
        int z = scn.nextInt();
        ArrayList<Integer> zlist = new ArrayList<Integer>();
        int sum = 0;
        int [] lettuce = new int[N];
        for (int i = 0; i < lettuce.length; i++){
            lettuce[i] = scn.nextInt();
            if (lettuce[i] == x) xlist.add(x);
            if (lettuce[i] == y) ylist.add(y);
            if (lettuce[i] == z) zlist.add(z);
            sum += lettuce[i];
        }
        int Alice = sum / 2;
        int Bob = sum / 2;
        if (Alice / z >= 1){//300
            int tmp = Alice / z;
            for (int i = 0; i < tmp; i++){
                if (zlist.size() == 0) break;
                else {
                    Alice -= z;//300
                    zlist.remove(0);
                }
            }
            System.out.println("Alice"+Alice);
        }
        if (Alice / y >= 1){//200
            int tmp = Alice / y;
            for (int i = 0; i < tmp; i++){
                if (ylist.size() == 0) break;
                else {
                    Alice -= y;//200
                    ylist.remove(0);
                }
            }
            System.out.println("Alice"+Alice);
        }
        if (Alice / x >= 1){//100
            int tmp = Alice / x;
            for (int i = 0; i < tmp; i++){
                if (xlist.size() == 0) break;
                else {
                    Alice -= x;//100
                    xlist.remove(0);
                }
            }
            System.out.println("Alice"+Alice);
        }
        System.out.println("Bob"+Bob);
        if (Bob / z >= 1){
            int tmp = Bob / z;
            for (int i = 0; i < tmp; i++){
                if (zlist.size() == 0) break;
                else {
                    Bob -= z;//100
                    zlist.remove(0);
                }
            }
            System.out.println("Bob"+Bob);
        }
        if (Bob / y >= 1){
            int tmp = Bob / y;
            for (int i = 0; i < tmp; i++){
                if (ylist.size() == 0) break;
                else {
                    Bob -= y;//100
                    ylist.remove(0);
                }
            }
            System.out.println("Bob"+Bob);
        }
        if (Bob / x >= 1){
            int tmp = Bob / x;
            for (int i = 0; i < tmp; i++){
                if (xlist.size() == 0) break;
                else {
                    Bob -= x;//100
                    xlist.remove(0);
                }
            }
            System.out.println("Bob"+Bob);
        }
        if (Bob == 0 && Alice == 0 && xlist.size() == 0 && ylist.size() == 0 && zlist.size() == 0) System.out.println("YES");
        else {
            System.out.println("NO");
            System.out.println("Alice"+Alice);
            System.out.println("Bob"+Bob);
            System.out.println("Xlist"+xlist.size());
            System.out.println("Ylist"+ylist.size());
            System.out.println("Zlist"+zlist.size());
        }
    }
}