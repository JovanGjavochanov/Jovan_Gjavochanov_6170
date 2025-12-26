package ass2;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {

    public static Student createStudent(String fullName, String yearOfStudy, int id) {
        return new Student(fullName, yearOfStudy, id);
    }

    public static void print(Student s) {
        s.print();
    }

    public static void main(String[] args) {
        Random r = new Random();

        List<String> names = Arrays.asList(
                "Kole Kolev", "Ana Petrova", "Marko Ivanov", "Sara Stojanovska", "Jovan Gavocanov"
        );

        // STREAM: create Student list
        List<Student> students = names.stream()
                .map(name -> new Student(
                        name,
                        String.valueOf(r.nextInt(3) + 1),   // year 1–3
                        r.nextInt(9000) + 1000              // id 1000–9999
                ))
                .collect(Collectors.toList());

        // Print all students
        System.out.println("=== All Students ===");
        students.forEach(Student::print);

        // Filter only 2nd year students
        List<Student> secondYear = students.stream()
                .filter(s -> s.getYearOfStudy().equals("2"))
                .collect(Collectors.toList());

        System.out.println("\n=== Second Year Students ===");
        secondYear.forEach(Student::print);
    }
}
