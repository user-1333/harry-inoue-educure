import java.util.ArrayList;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,new Integer[]{85, 92, 78, 55, 43});
        System.out.println("点数リスト: " + list);
        System.out.println("平均点: " + list.stream()
                .mapToDouble(Integer::doubleValue)
                .average().orElse(0));
        System.out.println("最高点: " + Collections.max(list));
        System.out.println("不合格者数: " + list.stream()
                .filter(score -> score <= 60)
                .count());
    }
}
