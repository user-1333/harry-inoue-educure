public class Library {
    void lendBook(Book book) {
        if (book.isLent()) {
            System.out.println("エラー: この本は既に貸し出し中です");
            return;
        }
        book.setLent(true);
        System.out.printf("「%s」を貸し出しました。\n", book.getTitle());
    }
    void returnBook(Book book) {
        if (!book.isLent()) {
            System.out.println("エラー: この本は貸し出されていません");
            return;
        }
        book.setLent(false);
        System.out.printf("「%s」を返却しました。\n", book.getTitle());
    }
}
