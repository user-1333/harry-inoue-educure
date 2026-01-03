public class Main2 {
    public static void main(String[] args) {
        Monster dragon = new Monster("スライム", 50);
        Monster dragon1 = new Monster("スライム", 10);
        Monster dragon2 = new Monster("スライム", 50);
        if (dragon.equals(dragon1)) {
            System.out.println("スライムとスライム1は同じモンスターです");
        } else {
            System.out.println("スライムとスライム1は別のモンスターです");
        }
        if (dragon.equals(dragon2)) {
            System.out.println("スライムとスライム2は同じモンスターです");
        } else {
            System.out.println("スライムとスライム2は別のモンスターです");
        }
    }
}
