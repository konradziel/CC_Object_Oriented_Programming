package university;

public class Student implements Comparable<Student> {
    private String name;
    private float grade;

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public float getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public int compareTo(Student obj) {
        return Float.compare(this.grade, obj.grade);
    }
}
