public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.floor((Math.PI * radius * radius)*10)/10;
    }
}
