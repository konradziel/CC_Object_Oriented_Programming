package interfejsyComparable.zad11;

public class Student implements Comparable<Student> {
    private String name;
    private double averageGrade;
    private int yearOfStudy;

    public Student(String name, double averageGrade, int yearOfStudy) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", averageGrade=" + averageGrade +
                ", yearOfStudy=" + yearOfStudy +
                '}';
    }

    @Override
    public int compareTo(Student obj) {
        int averComparison = Double.compare(obj.averageGrade, this.averageGrade);
        if(averComparison!=0){
            return averComparison;
        }
        return Integer.compare(this.yearOfStudy, obj.yearOfStudy);
    }
}
