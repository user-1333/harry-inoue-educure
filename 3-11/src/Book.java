public class Book extends Product {

    // フィールド
    private final String author;
    private final int stockQuantity;

    // コンストラクタ
    public Book(String name, int price, String author, int stockQuantity) {
        super(name, price);
        this.author = author;
        this.stockQuantity = stockQuantity;
    }

    // 本の情報を表示
    @Override
    public void displayInfo() {
        System.out.println("書籍名：" + name);
        System.out.println("著者：" + author);
        System.out.println("価格：" + price + "円");
    }

    // 在庫チェック
    @Override
    public boolean checkStock() {
        if (stockQuantity >= 1) {
            System.out.println("在庫あり");
            return true;
        } else {
            System.out.println("在庫なし");
            return false;
        }
    }
}
