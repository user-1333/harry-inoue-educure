public class Main2 {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(5, 10),
        };
        double area = 0;
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            area += shape.getArea();
        }
        System.out.println("Total Area: " + area);
    }
}
