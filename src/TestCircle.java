class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 3.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();

        System.out.println("Bán kính: " + circle1.getRadius());
        System.out.println("Diện tích: " + circle1.getArea());

        Circle circle2 = new Circle(2.5);

        System.out.println("Bán kính: " + circle2.getRadius());
        System.out.println("Diện tích: " + circle2.getArea());
    }
}
