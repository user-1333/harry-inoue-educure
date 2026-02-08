public class Main2 {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setTitle("Java入門");

        System.out.println("「" + myBook.getTitle() + "」" + "を登録しました！");
        myBook.lend();
        myBook.lend(); // 2回目の貸し出しを試みる
        myBook.returnBook();
        myBook.lend(); // 返却後に再度貸し出しを試みる
    }
}
