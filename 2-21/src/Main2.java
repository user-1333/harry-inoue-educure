public class Main2 {
    public static void main(String[] args) {
        double r = 5;
        calculateCircle(r);
    }
    static void calculateCircle(double r){
        System.out.printf("円の面積：%.14f%n", Math.PI * r * r);
        System.out.printf("円周：%.14f%n", 2 * Math.PI * r);
    }
}
