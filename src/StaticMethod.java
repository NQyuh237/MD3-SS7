public class StaticMethod {
    public static double PI = 3.14;
    public static double calcCircleArea(double R) {
        return PI * R * R;
    }
    public static double calcRectangleArea(double width, double height) {
        return width * height;
    }
    public static double calcTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
