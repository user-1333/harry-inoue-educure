public class Warehouse<T> {
    private T item;

    public void store(T item) {
        System.out.println("商品追加: " + item );
        this.item = item;
    }
    public void retrieve() {
        T temp = this.item;
        this.item = null;
        System.out.println("取り出し: " + temp );
    }
    public boolean isEmpty() {
        return this.item == null;
    }
}
