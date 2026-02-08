public class Main2 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(5, 10),
        };
        double area = 0;
        for (Shape shape : shapes) {
            if (shape instanceof Circle){
                System.out.print("円の");
            } else if (shape instanceof Rectangle){
                System.out.print("長方形の");
            }
            System.out.println("面積: " + shape.getArea());
            area += shape.getArea();
        }
        System.out.println("総面積: " + area);
    }
}
