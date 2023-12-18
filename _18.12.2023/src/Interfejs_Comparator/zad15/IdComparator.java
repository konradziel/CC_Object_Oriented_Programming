package Interfejs_Comparator.zad15;

import Interfejs_Comparator.zad10.Student;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {

    @Override
    public int compare(Student obj1, Student obj2) {
        return Integer.compare(obj1.getId(), obj2.getId());
    }
}
