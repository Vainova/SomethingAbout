package Student;


public class Student {
    private String name;
    private int group;
    private int course;
    private int biologyMark;
    private int mathMark;
    private int englishMark;
    private double averageMark;

    public Student(String name, int group, int course, int biologyMark, int mathMark, int englishMark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.biologyMark = biologyMark;
        this.mathMark = mathMark;
        this.englishMark = englishMark;
        this.averageMark = (double) (biologyMark + mathMark + englishMark) / 3;
    }

    public int getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}






