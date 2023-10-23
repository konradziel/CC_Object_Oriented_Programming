

public class H3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Test example of a string");
        //String result =
        System.out.println("Original string: " + str);
        removeSpaces(str);
        System.out.println("String without spaces: " + str);
    }

    public static void removeSpaces(StringBuilder str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                str.deleteCharAt(i);
                i--;
                length--;
            }
        }
    }
}
