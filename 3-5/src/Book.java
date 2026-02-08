public class Book {
    private int id;
    private String title;
    private String author;
    private int pages;

    Book(String title, String author,int id) {
        this.title = title;
        this.author = author;
        this.pages = 0;
        this.id = id;
    }
    Book(String title, String author, int id ,int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void getInfo() {
        System.out.println("Book" + this.id + "Title: " + this.getTitle());
        System.out.println("Book" + this.id + "Author: " + this.getAuthor());
        System.out.println("Book" + this.id + "Pages: " + this.getPages());
    }

}
