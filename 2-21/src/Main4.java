import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void main(String[] args) {
        int[] arr = {5,2,8,1,9};
        processNumbers(arr);
    }
    static void processNumbers(int[] numbers){
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : numbers){
            list.add(n);
        }
        System.out.printf("元のリスト：%s%n",list);
        Collections.sort(list);
        System.out.printf("ソート後：%s%n",list);
        System.out.printf("最大値：%d%n",Collections.max(list));
        System.out.printf("最小値：%d%n",Collections.min(list));
    }
}
