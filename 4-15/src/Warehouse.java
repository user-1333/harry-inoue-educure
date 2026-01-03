import java.util.ArrayList;

public class Warehouse<T> {
    private T item;

    public void store(T item) {
        System.out.println("商品追加: [" + item + "]");
        this.item = item;
    }
    public T retrieve() {
        System.out.println("取り出し: [" + item + "]");
        T temp = this.item;
        this.item = null;
        return temp;
    }
    public boolean isEmpty() {
        return this.item == null;
    }
}
