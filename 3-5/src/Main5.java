public class Main5 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "山田太郎",1);
        Book book2 = new Book("Python Programming", "鈴木次郎",2, 350);
        book1.getInfo();
        book2.getInfo();
    }
}
