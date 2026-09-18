import java.util.List;

public class ReportGenerator {
    public static void generate(List<Student> students) {
        System.out.println("\n--- Student Report ---");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("Total Students: " + students.size());
    }
}
