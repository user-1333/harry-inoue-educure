public class GameItem {
    private String itemName;
    private int itemPrice;

    public GameItem(String itemName, int itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "[ " + itemName + " ]" + " 価格: " + itemPrice + "G";
    }
}
