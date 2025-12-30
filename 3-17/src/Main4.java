public class Main4 {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Java入門");
        Book book2 = new Book("データ構造とアルゴリズム");

        library.lendBook(book1); // 貸し出し完了: Java入門
        library.lendBook(book1); // 既に貸し出されています: Java入門

        library.returnBook(book1); // 返却完了: Java入門
        library.returnBook(book1); // この本は貸し出されていません: Java入門

        library.lendBook(book2); // 貸し出し完了: データ構造とアルゴリズム
    }
}
