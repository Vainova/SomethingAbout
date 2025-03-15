package Student;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentCollection {
    public static List<Student> deleteStudentsWhoAverageMarkLessThree(List<Student> students) {
        return students.stream().filter(student -> student.getAverageMark() > 3).collect(Collectors.toList());
    }

    public static List<Student> forTheNextCourse(List<Student> students) {
        return students.stream()
                .filter(student -> student.getAverageMark() >= 3)
                .peek(student -> student.setCourse(student.getCourse() + 1))
                .collect(Collectors.toList());
    }

    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}



