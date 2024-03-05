package Interfejs_Comparator.zad15;

import Interfejs_Comparator.zad10.Student;

import java.util.Comparator;


public class AverageGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student obj1, Student obj2) {
        return Double.compare(obj2.getAverageGrade(), obj1.getAverageGrade());
    }
}
