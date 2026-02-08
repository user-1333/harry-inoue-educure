public class Main3 {
    public static void main(String[] args) {
        Product product = new Product("りんご", 100);
        product.getName();
        product.getStock();

        product.removeStock(50);
        product.addStock(10);
        product.removeStock(150);
        product.getStock();
    }
}
