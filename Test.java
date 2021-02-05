import java.util.Collections;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {//เช็คเลขซ้ำ 5
        int[] x = {1, 2, 3, 5, 5};
        int max = Arrays.stream(x).max().getAsInt();
        System.out.println(max);

        System.out.println("BANANA");
        
        
        System.out.println("SASAGEYO");
    }
}
