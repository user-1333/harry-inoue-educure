import java.util.ArrayList;
import java.util.Collections;

public class Main1 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        Collections.addAll(nameList, new String[]{"田中", "佐藤", "鈴木"});
        System.out.println("学生リスト: " + nameList);
        System.out.println("2番目の学生: " + nameList.get(1));
        System.out.println("学生数: " + nameList.size());
        System.out.println("鈴木さんはリストに含まれていますか？: " + nameList.contains("鈴木"));
    }
}