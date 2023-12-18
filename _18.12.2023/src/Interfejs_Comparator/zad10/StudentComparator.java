package Interfejs_Comparator.zad10;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student obj1, Student obj2) {
        int base = Double.compare(obj2.getAverageGrade(), obj1.getAverageGrade());
        if (base != 0) {
            return base;
        }
        return String.CASE_INSENSITIVE_ORDER.compare(obj1.getName(), obj2.getName());

    }
}
