public class Main2 {
    public static void main(String[] args) {
    // テスト用配列の準備
    int[] numbers = {10, 20, 30};
    ArrayAccessor accessor = new ArrayAccessor(numbers);

    System.out.println("\n位置5の要素");
    // TODO: try-catchで位置5の要素を取得
    try {
        int value = accessor.getElement(numbers, 5);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("位置5の要素: エラー：" + "配列の範囲外にアクセスしました");
        /* ここにコードを記載 */
    }
    try {
        System.out.println("\n位置1の要素");
        System.out.println("位置1の要素: " + accessor.getElement(numbers, 1));
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("位置1の要素: エラー：" + "配列の範囲外にアクセスしました");
    }
}
}
