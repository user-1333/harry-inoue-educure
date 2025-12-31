public class Library {
    static int availableBooks = 100;
    void borrowBook() {
        System.out.println("貸出可能な本: " + availableBooks + "冊");
        if (availableBooks > 0) {
            availableBooks--;
            System.out.println("本を1冊借りました。");
        } else {
            System.out.println("貸出可能な本がありません。");
        }
    }
    void returnBook() {
        System.out.println("貸出可能な本: " + availableBooks + "冊");
        availableBooks++;
        System.out.println("本を1冊返却しました。");
        System.out.println("貸出可能な本: " + availableBooks + "冊");
    }

}
