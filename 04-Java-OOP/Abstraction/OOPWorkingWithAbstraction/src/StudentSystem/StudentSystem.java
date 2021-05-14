package StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentsByName;

    public StudentSystem() {
        this.studentsByName = new HashMap<>();
    }

    public Map<String, Student> getStudentsByName() {
        return this.studentsByName;
    }

    public String parseCommand(String[] args) {

        String result = null ;

        if (args[0].equals("Create")) {
            Student student = CreateStudentCommand.createStudent(args);
            studentsByName.putIfAbsent(student.getName(), student);


        } else if (args[0].equals("Show")) {
            ShowStudentInfo showStudentInfo =
                    new ShowStudentInfo(studentsByName.get(args[1]));

            result = showStudentInfo.execute();


        } else {
            result = new ExitCommand().execute();

        }
        return result;
    }
}
