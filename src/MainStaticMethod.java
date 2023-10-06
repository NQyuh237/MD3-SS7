public class MainStaticMethod {
    public static void main(String[] args) {
        double circle1Area = StaticMethod.calcCircleArea(3.5);
        double circle2Area = StaticMethod.calcCircleArea(6);

        double triangle1Area = StaticMethod.calcTriangleArea(3, 4, 5);
        double triangle2Area = StaticMethod.calcTriangleArea(4.5, 7, 6);

        double rectangle1Area = StaticMethod.calcRectangleArea(2.5, 6);
        double rectangle2Area = StaticMethod.calcRectangleArea(4, 7);

        System.out.println("Diện tích hình tròn 1: " + circle1Area);
        System.out.println("Diện tích hình tròn 2: " + circle2Area);
        System.out.println("Diện tích tam giác 1: " + triangle1Area);
        System.out.println("Diện tích tam giác 2: " + triangle2Area);
        System.out.println("Diện tích hình chữ nhật 1: " + rectangle1Area);
        System.out.println("Diện tích hình chữ nhật 2: " + rectangle2Area);
    }
}
