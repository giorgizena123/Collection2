import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // WordCounter-ის მაგალითი
        WordCounter.main(args);

        // Student-ის მაგალითი
        Student student1 = new Student("1", "გიორგი", "აბაშიძე");
        student1.addGrade("ქართული", 10);
        student1.addGrade("მათემატიკა", 8);

        Student student2 = new Student("2", "ანა", "ბერიძე");
        student2.addGrade("ქართული", 9);
        student2.addGrade("მათემატიკა", 9);

        Student student3 = new Student("3", "ზურა", "გელაშვილი");
        student3.addGrade("ქართული", 7);
        student3.addGrade("მათემატიკა", 10);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        System.out.println("\nსტუდენტები საშუალო ქულის მიხედვით:");
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nსტუდენტები გვარის მიხედვით:");
        Collections.sort(students, new StudentLastNameComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
