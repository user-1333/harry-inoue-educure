public class Main1 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.makeSound(); // 犬の鳴き声: ワンワン！
        dog.makeSound(); // 猫の鳴き声: ニャー！
    }
}