import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student implements Comparable<Student> {
    private String id;
    private String firstName;
    private String lastName;
    private Map<String, ArrayList<Integer>> grades;

    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, int grade) {
        grades.computeIfAbsent(subject, k -> new ArrayList<>()).add(grade);
    }

    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        int totalGrades = 0;
        int totalCount = 0;

        for (ArrayList<Integer> subjectGrades : grades.values()) {
            for (int grade : subjectGrades) {
                totalGrades += grade;
                totalCount++;
            }
        }

        return (double) totalGrades / totalCount;
    }

    public String getLastName(){
        return lastName;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.getAverageGrade(), other.getAverageGrade());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", averageGrade=" + getAverageGrade() +
                '}';
    }
}
