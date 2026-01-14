import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] seats = {
                {0, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 1},
                {0, 0, 1, 0, 0, 0}
        };
        System.out.println("予約前の座席表:");
        printSeats(seats);
        System.out.print("予約したい座席の行番号を入力してください（1-5）: ");
        int row = sc.nextInt()-1;
        System.out.print("予約したい座席の列番号を入力してください（1-6）: ");
        int col = sc.nextInt()-1;
        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length) {
            System.out.println("無効な座席番号です。");
            sc.close();
            return;
        }
        if (seats[row][col] == 0) {
            seats[row][col] = 1;
            System.out.println("座席が予約されました。");
        } else {
            System.out.println("指定された座席はすでに予約済みです。");
            return;
        }
        System.out.printf("%d行目%d列目の座席を予約しました。\n", (row+1), (col+1));
        System.out.println("予約後の座席表:");
        printSeats(seats);
        sc.close();
    }

    private static void printSeats(int[][] seats) {
        for (int[] seat : seats) {
            for (int i : seat) {
                System.out.print("[" + i + "]");
            }
            System.out.println();
        }
    }
}

//[0][0][1][0][0][0]
//[0][1][0][0][1][0]
//[0][0][0][0][0][0]
//[1][0][0][0][0][1]
//[0][0][1][0][0][0]
