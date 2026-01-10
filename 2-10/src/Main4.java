import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
//        int side1 = 3;
//        int side2 = 4;
//        int side3 = 5;
        int[] side1s = {5,5,3,5,3,3,1};
        int[] side2s = {5,5,5,3,4,4,2};
        int[] side3s = {5,3,5,5,5,6,10};
        // 三角形の成立条件の確認
        for (int i = 0; i < 7; i++) {
            int side1 = side1s[i];
            int side2 = side2s[i];
            int side3 = side3s[i];
            String result = isTriangle(side1, side2, side3);
            System.out.println(result);
        }
    }
    static String isTriangle(int side1, int side2, int side3) {
        // 三角形の成立条件の確認
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            return "三角形が成立しません。";
        }
        if (side1 == side2 && side1 == side3) {
            return "正三角形です。";
        }
        List<Integer> sides = new ArrayList<>();
        Collections.addAll(sides, side1, side2, side3);
        sides.sort(Integer::compareTo);
        if (Math.pow(sides.getFirst(), 2) + Math.pow(sides.get(1), 2) == Math.pow(sides.get(2), 2)) {// 直角三角形の判定
            if (side1 == side2 || side1 == side3 || side2 == side3) {
                return "直角二等辺三角形です。";
            }
            return "直角三角形です。";
        }
        if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "二等辺三角形です。";
        } else {
            return "不等辺三角形です。";
        }
    }
}
