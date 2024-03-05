package ZadanieNaAktywność.Wariant461;

public class W461 {
    public static void main(String[] args) {
        Integer[] tabInteger = {1, 3, -4, 9, 5, -6};
        String[] tabString = {"abc", "def", "ghi", "jkl"};

        System.out.println(contains(tabInteger, 3));
        System.out.println(contains(tabInteger, "abc"));
        System.out.println(contains(tabString, "abc"));
        System.out.println(contains(tabString, 3));
    }

    public static <T> boolean contains(T[] tab, T x){
        for(var elem: tab){
            if(elem.equals(x)){
                return true;
            }
        }
        return false;
    }
}
