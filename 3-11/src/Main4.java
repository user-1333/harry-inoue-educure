public class Main4 {
    public static void main(String[] args) {
        // Dogクラスのインスタンスを作成
        Dog dog = new Dog("ポチ", 3);

        // 犬の情報を表示
        System.out.println("犬の名前: " + dog.getName());
        System.out.println("犬の年齢: " + dog.getAge() + "歳");

        // 犬の動作を実行
        dog.makeSound();
        dog.eat();
    }
}
