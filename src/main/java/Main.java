import PhoneDirectory.PhoneDirectory;
import Student.Student;

import java.util.*;

import static Student.StudentCollection.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Igor", 1, 3, 1, 1, 1));
        students.add(new Student("Max", 2, 1, 4, 7, 6));
        students.add(new Student("Lev", 1, 2, 8, 10, 9));
        students.add(new Student("Alexander", 2, 1, 7, 6, 9));
        students.add(new Student("Ivan", 1, 3, 6, 8, 7));
        students.add(new Student("Mihael", 2, 2, 10, 9, 7));

        List<Student> updatedStudents = deleteStudentsWhoAverageMarkLessThree(students);
        List<Student> nextCourseStudents = forTheNextCourse(students);

        for (Student nextCourseStudent : nextCourseStudents) {
            System.out.println(nextCourseStudent.getName() + ":" + nextCourseStudent.getCourse());
        }

        for (Student updatedStudent : updatedStudents) {
            System.out.println(updatedStudent.getName() + ":" + updatedStudent.getAverageMark());
        }

        Set<Student> setStudents = new HashSet<>(students);
        printStudents(setStudents, 3);

        // Task 2
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        Map< String, List<String>> contacts;
        phoneDirectory.add("Ivanov", "+375292099090");
        phoneDirectory.add("Sumov", "+3752978348438");
        phoneDirectory.add("Levov", "+3758954892040");
        phoneDirectory.add("Kotov", "+3752998292924");
        phoneDirectory.add("Ivanov", "+3752920954430");

        List<String> ivanovPhone = phoneDirectory.get("Ivanov");
        System.out.println(ivanovPhone);
    }
}
