import java.util.regex.Pattern;

public class Main3 {
    public static void main(String[] args) {
        Pattern name = Pattern.compile("^[a-zA-Z0-9_]{4,16}$");
        Pattern password = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8,}$");
        String[] usernames = {"Player_1", "123456", "P@layer"};
        String[] passwords = {"Password123", "password123", "Pass"};
        System.out.println("=== ユーザー名の検証結果 ===");
        for (String username : usernames) {
            if (name.matcher(username).matches()) {
                System.out.println("有効: " + username);
            } else {
                System.out.println("無効: " + username);
            }
        }
        System.out.println();
        System.out.println("=== パスワードの検証結果 ===");
        for (String pwd : passwords) {
            if (password.matcher(pwd).matches()) {
                System.out.println("有効: " + pwd);
            } else {
                System.out.println("無効: " + pwd);
            }
        }

    }
}
