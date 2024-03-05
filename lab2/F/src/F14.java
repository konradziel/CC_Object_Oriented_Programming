public class F14 {
    public static void main(String[] args) {
        double [] tab = {1.24, 5.34, 3.84, 4.92};
        double [] tab2 = new double[0];
        System.out.println("Średnia arytmetyczna liczb w tablicy jest równa " + average(tab));
        System.out.println("Średnia arytmetyczna liczb w tablicy drugiej jest równa " + average(tab2));
    }

    public static double average(double[] tab) {
        if (tab.length == 0)
            return 0;
        double sum = 0;
        for (double a : tab) {
            sum += a;
        }

        return sum / tab.length;
    }
}
