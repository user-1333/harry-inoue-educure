public class Main2 {
    public static void main(String[] args) {
        Monster monster = new Monster("スライム", 5);
        Monster monster1 = new Monster("スライム", 5);
        Monster monster2 = new Monster("スライム", 10);
        if (monster.equals(monster1)) {
            System.out.println("スライムLv.5 と スライムLv.5 は同じモンスターです");
        } else {
            System.out.println("スライムLv.5 と スライムLv.10 は違うモンスターです");
        }
        if (monster.equals(monster2)) {
            System.out.println("スライムLv.5 と スライムLv.5 は同じモンスターです");
        } else {
            System.out.println("スライムLv.5 と スライムLv.10 は違うモンスターです");
        }
    }
}
