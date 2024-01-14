package university;

public class TestFindMedian {
    public static void main(String[] args) {
        Student[] tab = new Student[4];
        tab[0] = new Student("abc", 4.53F);
        tab[1] = new Student("dfg", 7.23F);
        tab[2] = new Student("hij", 2.93F);
        tab[3] = new Student("klm", 3.57F);

        findMedianClass alg = new findMedianClass();
        System.out.println(alg.findMedian(tab));
    }
}
