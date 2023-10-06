package Menu;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
//    static Book[] arrBook = new Book[100];
//    static {
//        arrBook[0] = new Book(1,"AAA","ABC","Kinh Doanh",10,50,80,true);
//        arrBook[1] = new Book(2,"BBB","ABC1","Truyện",10,50,80,true);
//        arrBook[2] = new Book(3,"CCC","ABC2","Xã Hội",10,50,80,true);
//        arrBook[3] = new Book(4,"DDD","ABC2","Đời sống",10,50,80,true);
//        arrBook[4] = new Book(5,"EEE","ABC3","Kinh Tế",10,50,80,true);
//    }
//    static int indexBook = 5;

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("----------------Menu---------------------");
            System.out.println("                        Danh mục     ");
            System.out.println("Chon 1 Quản lý sinh viên");
            System.out.println("Chon 2 Quản lý môn học");
            System.out.println("Chon 3 Quản lý điểm");
            System.out.println("Chon 0 Thoát ");
            System.out.print("Mời chọn lựa : ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    Main.menuStudentManagement();
                    break;
                case 2:
                    Main.menuSubManagement();
                    break;
                case 3:
                    Main.menuMarkManagement();
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
    public static void menuStudentManagement(){
        int choice1;
        do {
            System.out.println("------------------------Quản lý sinh vien-------------------------");
            System.out.println("                        Danh mục     ");
            System.out.println("Chon 1 Them học sinh");
            System.out.println("Chon 2 Sửa học sinh");
            System.out.println("Chon 3 Xóa học sinh");
            System.out.println("Chon 0 Thoát ");
            System.out.print("Mời chọn lựa : ");
            choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1){
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    return;
            }
        }while (true);
    }
    public static void menuSubManagement(){
        int choice2;
        do {
            System.out.println("------------------------Quản lý môn học-------------------------");
            System.out.println("                        Danh mục     ");
            System.out.println("Chon 1 Them môn học");
            System.out.println("Chon 2 Sửa môn học");
            System.out.println("Chon 3 Xóa môn học");
            System.out.println("Chon 0 Thoát ");
            System.out.print("Mời chọn lựa : ");
            choice2 = Integer.parseInt(scanner.nextLine());
            switch (choice2){

                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    return;
            }
        }while (true);

    }
    public static void menuMarkManagement(){
        int choice3;
        do {
            System.out.println("------------------------Quản lý Điểm-------------------------");
            System.out.println("                        Danh mục     ");
            System.out.println("Chon 1 Them Điểm cho học sinh");
            System.out.println("Chon 2 Sửa Điểm cho học sinh");
            System.out.println("Chon 3 Xóa Điểm ");
            System.out.println("Chon 0 Thoát ");
            System.out.print("Mời chọn lựa : ");
            choice3 = Integer.parseInt(scanner.nextLine());
            switch (choice3){

                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    return;
            }
        }while (true);

    }
}