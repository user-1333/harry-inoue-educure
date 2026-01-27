import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        Collections.addAll(list,5,2,8,1,9);
        System.out.printf("元のリスト：%s%n",list);
        processNumbers(list);
    }
    static void processNumbers(ArrayList<Integer> numbers){
        Collections.sort(numbers);
        System.out.printf("ソート後：%s%n",numbers);
        System.out.printf("最大値：%d%n",Collections.max(numbers));
        System.out.printf("最小値：%d%n",Collections.min(numbers));
    }
}
