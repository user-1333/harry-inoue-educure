public class Product {
    private final String name;
    private int stock;
    Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }
    public void getName() {
        System.out.println("商品名:" + name);
    }
    public void getStock() {
        System.out.printf("在庫数:%d\n", stock);
    }

    public void addStock(int amount) {
        if(amount < 0) {
            System.out.println("ストックの量は正の数でなければなりません。");
            return;
        }
        this.stock += amount;
        System.out.printf("在庫数(%d個入荷):%d\n", amount, stock);
    }

    public void removeStock(int amount) {
        if (amount < 0 || amount > stock) {
            System.out.println("ストックの量が不正です。");
            return;
        }
        this.stock -= amount;
        System.out.printf("在庫数(%d個出荷):%d\n", amount, stock);
    }


}
