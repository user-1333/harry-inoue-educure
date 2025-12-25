public class Main5 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "山田太郎");
        Book book2 = new Book("Python Programming", "鈴木次郎", 350);
        System.out.println("Book 1 Title: " + book1.getTitle());
        System.out.println("Book 1 Author: " + book1.getAuthor());
        System.out.println("Book 1 Pages: " + book1.getPages());
        System.out.println("Book 2 Title: " + book2.getTitle());
        System.out.println("Book 2 Author: " + book2.getAuthor());
        System.out.println("Book 2 Pages: " + book2.getPages());
    }
}
