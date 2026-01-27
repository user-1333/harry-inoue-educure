import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        Collections.addAll(list,5,2,8,1,9);
        System.out.printf("元のリスト：%s%n",list);
        sortList(list);
    }
    static void sortList(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.printf("ソート後：%s%n",list);
        System.out.printf("最大値：%d%n",Collections.max(list));
        System.out.printf("最小値：%d%n",Collections.min(list));
    }
}
