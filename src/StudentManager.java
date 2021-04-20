import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addNewStudent(Student student){
        studentList.add(student);
    }
    public void showAllStudent(){
        for (Student s: studentList
             ) {
            System.out.println(s);
        }
    }
}