public class Book {
    private String title;
    private boolean isLent;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void lend() {
        if (isLent) {
            System.out.println("申し訳ありません。この本は貸出中です");
            return;
        }
        isLent = true;
        System.out.println("本を貸し出しました。");
    }
    public void returnBook() {
        isLent = false;
        System.out.println("本を返却しました。");
    }
}
