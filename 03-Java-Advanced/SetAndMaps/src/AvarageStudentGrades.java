import java.util.*;
import java.util.stream.Collectors;

public class AvarageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGrades = new TreeMap<>();

        while (n-- > 0){
            String[] token = scanner.nextLine().split("\\s+");
            String name = token[0];
            double grade = Double.parseDouble(token[1]);

            studentGrades.putIfAbsent(name, new ArrayList<>());
            studentGrades.get(name).add(grade);

        }
            for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()){
                System.out.println(String.format("%s -> %s (avg: %.2f)", entry.getKey(),
                        getGradesAsString(entry.getValue()),
                        getAvrgGrade(entry.getValue())));
            }



    }

    private static Double getAvrgGrade(List<Double> grades) {
        return grades.stream()
                .mapToDouble(g -> g)
                .average()
                .orElse(0.00);
    }

    private static String getGradesAsString(List<Double> grades) {
        return grades.stream()
                .map(grade -> String.format("%.2f", grade))
                .collect(Collectors.joining(" "));
    }
}
