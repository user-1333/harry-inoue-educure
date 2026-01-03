public class Inventory<T> {
    private T item;
    private final ProductCategory category;

    public Inventory(ProductCategory category) {
        this.category = category;
    }
    public void stockIn(T temp) {
        System.out.printf("%sコーナー:%sを入荷", this.category.getDisplayName(), temp);
        this.item = temp;
    }
    public T stockOut() {
        T temp = this.item;
        this.item = null;
        return temp;
    }
    public T getCurrentStock() {
        return this.item;
    }
}
