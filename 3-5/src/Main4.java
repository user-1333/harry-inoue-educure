public class Main4 {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(1500);

        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: ￥" + product.getPrice());
    }
}
