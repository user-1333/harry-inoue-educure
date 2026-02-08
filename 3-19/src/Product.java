public class Product {
    private final String name;
    private final int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public String toString() {
        String str = "商品名: " + name + "(" + price + "円)";
//        System.out.println(str);
        return str;
    }
}
