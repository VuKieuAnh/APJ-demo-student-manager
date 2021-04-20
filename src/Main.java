import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final Grade khoiA = new Grade("Khoi A", "Toan", "Ly", "Hoa");
    private static final Grade khoiB = new Grade("Khoi B", "Toan", "Sinh", "Hoa");
    private static final Grade khoiC = new Grade("Khoi C", "Van", "Su", "Dia");
    private static List<Student> students = new ArrayList<>();

    private static StudentManager oanh = new StudentManager();
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("1", "Vu Kieu Anh", "Ha Noi", "0");
        Student student2 = new Student("2", "Vu Kieu Anh2", "Ha Noi", "0", khoiB);
        student1.setGrade(khoiA);
        students.add(student1);
        students.add(student2);
        oanh.setStudentList(students);
        oanh.showAllStudent();
        addNewStudent();
        oanh.showAllStudent();
    }
    public static void addNewStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap id");
        String id = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Moi ban nhap ten");
        String name = scanner2.nextLine();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Moi ban nhap dia chi");
        String address = scanner3.nextLine();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Moi ban nhap do uu tien");
        String priority = scanner4.nextLine();
        Student student = new Student(id, name, address, priority);

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Moi ban nhap khoi");
        String grade = scanner5.nextLine();

        switch (grade){
            case "A":
                student.setGrade(khoiA);
                break;
            case "B":
                student.setGrade(khoiB);
                break;
            case "C":
                student.setGrade(khoiC);
                break;
        }
        oanh.addNewStudent(student);
    }
}