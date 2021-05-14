package StudentSystem;

public class CreateStudentCommand {

    public static Student createStudent(String[] data){
        var name = data[1];
        var age = Integer.parseInt(data[2]);
        var grade = Double.parseDouble(data[3]);
        return new  Student(name, age, grade);
    }

}
