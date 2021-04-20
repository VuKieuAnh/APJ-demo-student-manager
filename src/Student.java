public class Student {
    private String id;
    private String fullName;
    private String address;
    private String priority;
    private Grade grade;

    public Student(String id, String fullName, String address, String priority) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.priority = priority;
    }

    public Student(String id, String fullName, String address, String priority, Grade grade) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.priority = priority;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", priority='" + priority + '\'' +
                ", grade=" + grade +
                '}';
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}