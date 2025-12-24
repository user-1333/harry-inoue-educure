public class Main7 {
    public static void main(String[] args) {
        int[] keys   = {1,1,1,2,2,2,3};
        int[] counts = {1,2,3,1,2,3,1};
        for (int i = 0; i < 7; i++) {
            int key = keys[i];
            int count = counts[i];
            String result = inputLogic(key, count);
            System.out.println("key: " + key + ", count: " + count + " -> " + result);
        }
    }
    private static String inputLogic(int key, int count){
       if(key == 1){
           return switch (count) {
               case 1 -> "A";
               case 2 -> "B";
               default -> "C";
           };
       }
       if(key == 2){
          return switch (count) {
            case 1 -> "D";
            case 2 -> "E";
            default -> "F";
          };
       }
         return "Invalid key";
    }
}
