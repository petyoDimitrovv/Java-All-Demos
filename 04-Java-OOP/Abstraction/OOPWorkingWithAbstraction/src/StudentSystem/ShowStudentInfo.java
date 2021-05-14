package StudentSystem;

public class ShowStudentInfo {
    private Student student;

    public ShowStudentInfo(Student student){
        this.student = student;
    }


    public String execute() {
        return student != null ? this.student.toString() : null;
    }
}
