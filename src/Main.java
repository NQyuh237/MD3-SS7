public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass("Hello, World!");

        System.out.println("Giá trị ban đầu của myString: " + myObject.getMyString());

        myObject.setMyString("Xin chào, Việt Nam!");

        System.out.println("Giá trị mới của myString: " + myObject.getMyString());
    }
}
