import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InventoryManager {
    private Map<String, Product> inventory = new HashMap<>();
    public void addProduct(String name, int stock) {
        Product product = new Product(name, stock);
        inventory.put(name, product);
        System.out.printf("%sを入荷しました%n", name);
    }
    private Optional<Product> findProduct(String name) {
        return Optional.ofNullable(inventory.get(name));
    }
    public void sellProduct(String name) {
        // TODO: findProductの結果を取得
        Optional<Product> product = findProduct(name);

        // TODO: productが存在する場合
        if (product.isPresent()) {
            // TODO:ここで在庫を1減らす
            System.out.println(name + "の販売: 在庫から1個減少");
        } else {
            // 存在しない場合
            System.out.println("商品が見つかりません");
        }
    }
}
