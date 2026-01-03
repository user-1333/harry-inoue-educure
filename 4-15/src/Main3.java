public class Main3 {
    public static void main(String[] args) {
        Inventory<String> fruits = new Inventory<>(ProductCategory.FRUITS);
        // TODO: 残りも同様に作成

        // 商品を入荷
        // TODO: それぞれの在庫に商品を入荷
        fruits.stockIn("りんご");
        // TODO: 残りも同様に入荷

        System.out.println();
        // TODO: りんごを出荷
        System.out.println(fruits.stockOut() + "を出荷しました");

        // 在庫状態を表示
        System.out.println("現在の在庫状態:");
        // TODO: 各カテゴリの在庫状態を表示
        // ヒント: getCurrentStock()がnullの場合は"なし"と表示
        System.out.println("果物: " + (fruits.getCurrentStock() != null ?
                fruits.getCurrentStock() : "なし"));
    }
}
