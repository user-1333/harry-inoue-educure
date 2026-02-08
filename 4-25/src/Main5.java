import java.util.function.Function;

public class Main5 {
    public static void main(String[] args) {
        Function<Integer,Integer> multiplyByTwo = x -> x * 2;
        Function<Integer,Integer> subtractFive = x -> x - 5;
        Function<Integer,Boolean> isPositive = x -> x > 0;
        int num = 8;
        boolean result = isPositive.apply(subtractFive.apply(multiplyByTwo.apply(num)));
        if(result){
            System.out.println("正の数です");
        }else{
            System.out.println("負の数またはゼロです");
        }
    }
}
