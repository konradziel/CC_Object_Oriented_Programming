public class Wariant_331 {
    public static void main(String[] args) {
        int[] tab = {-2, 3, 4, 7, 10};
        int avg = averageValue(tab);

        if(avg == -1000) {
            System.out.println("Tab is empty");
        }
        else {
            System.out.println("Average value of all numbers in tab is: " + avg);
        }
    }

    public static int averageValue(int[] tab) {
        if (tab.length == 0) {
            return -1000;
        }

        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return sum/tab.length;
    }
}
