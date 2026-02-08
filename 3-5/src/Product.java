public class Product {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: ￥" + price);
    }
}
