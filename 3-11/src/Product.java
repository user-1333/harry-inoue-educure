public abstract class Product {

    // フィールド
    protected String name;
    protected int price;

    // コンストラクタ
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 商品情報を表示する抽象メソッド
    public abstract void displayInfo();

    // 在庫チェックを行う抽象メソッド
    public abstract boolean checkStock();
}
