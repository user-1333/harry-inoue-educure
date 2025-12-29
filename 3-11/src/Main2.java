public class Main2 {

    public static void main(String[] args) {
        // Bookクラスのインスタンスを作成
        Book book = new Book(
                "Java入門",
                2500,
                "山田太郎",
                10
        );

        // 本の情報と在庫情報を表示
        book.displayInfo();
        book.checkStock();
    }
}
