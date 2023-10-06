class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println("Thông tin ban đầu:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Class: " + student1.getClasses());

        student1.setName("Alice");
        student1.setClasses("C03");

        System.out.println("\nThông tin sau khi thay đổi:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Class: " + student1.getClasses());
    }
}
