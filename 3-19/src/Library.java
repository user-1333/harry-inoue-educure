public class Library {
    static int availableBooks = 100;
    static void borrowBook() {
        System.out.println("貸出可能な本: " + getAvailableBooks() + "冊");
        if (availableBooks > 0) {
            availableBooks--;
            System.out.println("本を1冊借りました。");
        } else {
            System.out.println("貸出可能な本がありません。");
        }
    }
    static void returnBook() {
        System.out.println("貸出可能な本: " + getAvailableBooks() + "冊");
        availableBooks++;
        System.out.println("本を1冊返却しました。");
        System.out.println("貸出可能な本: " + getAvailableBooks() + "冊");
    }

    static int getAvailableBooks() {
        return availableBooks;
    }

}
