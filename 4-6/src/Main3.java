import java.util.HashMap;

public class Main3 {
    public static void sell(String item, HashMap<String, Integer> inventory) {
        //商品を1つずつ販売する処理
        if (inventory.containsKey(item) && inventory.get(item) > 0) {
            inventory.put(item, inventory.get(item) - 1);
            System.out.println(item + "を1つ販売しました。");
        } else {
            System.out.println(item + "の在庫がありません。");
        }
    }
    public static void main(String[] args) {
        //在庫管理用のHashMapを作成
        HashMap<String, Integer> inventory = new HashMap<>();
        //商品の追加
        inventory.put("おにぎり", 15);
        inventory.put("サンドイッチ", 8);
        inventory.put("弁当", 5);

        //在庫の表示
        System.out.println("在庫リスト: " + inventory);
        //商品を販売
        sell("おにぎり", inventory);
        //販売後の在庫の表示
        System.out.println("販売後の在庫リスト: " + inventory);
        //在庫の確認
        System.out.println("アイスクリームは在庫にありますか？: " + inventory.containsKey("アイスクリーム"));
    }
}
