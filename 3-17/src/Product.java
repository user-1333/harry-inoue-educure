public class Product {
    private final String name;
    private int stock;
    Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }
    public String getName() {
        return name;
    }
    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if(amount < 0) {
            System.out.println("ストックの量は正の数でなければなりません。");
            return;
        }
        this.stock += amount;
    }

    public void removeStock(int amount) {
        if (amount < 0 || amount > stock) {
            System.out.println("ストックの量が不正です。");
            return;
        }
        this.stock -= amount;
    }


}
