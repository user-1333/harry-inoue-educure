public class Library {
    void lendBook(Book book) {
        if (book.isLent()) {
            System.out.println("既に貸し出されています: " + book.getTitle());
            return;
        }
        book.setLent(true);
        System.out.println("貸し出し完了: " + book.getTitle());
    }
    void returnBook(Book book) {
        if (!book.isLent()) {
            System.out.println("この本は貸し出されていません: " + book.getTitle());
            return;
        }
        book.setLent(false);
        System.out.println("返却完了: " + book.getTitle());
    }
}
