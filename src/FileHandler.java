import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    private static final String FILE_NAME = "students.txt";

    public static void saveStudents(ArrayList<Student> students) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                writer.write(s.getRollNo() + "," + s.getName() + "," + s.getCourse());
                writer.newLine();
            }
            System.out.println("Students saved to file successfully!");
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }

    public static ArrayList<Student> loadStudents() {
        ArrayList<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    int rollNo = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String course = parts[2];
                    students.add(new Student(name, rollNo, course));
                }
            }
            System.out.println("Students loaded from file successfully!");
        } catch (IOException e) {
            System.out.println("No existing student file found. Starting fresh.");
        }
        return students;
    }
}
