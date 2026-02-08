public class Main1 {
    public static void main(String[] args) {
        Pet myPet = new Pet();
        myPet.setName("ポチ");
        myPet.setEnergy(100);

        System.out.println(myPet.getName() + "生み出しました！");
        System.out.println("初期体力：" + myPet.getEnergy());
        myPet.eat();
        System.out.println("ご飯を食べた後の体力：" + myPet.getEnergy());
        myPet.play();
        System.out.println("遊んだ後の体力：" + myPet.getEnergy());
    }
}
