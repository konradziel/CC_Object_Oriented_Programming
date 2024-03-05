public class H17 {
    public static void main(String[] args) {
        StringBuffer input = new StringBuffer("capitalize every second");
        System.out.println("Original text: " + input);
        capitalizeEverySecond(input);
        System.out.println("Text after capitalization every second: " + input);
    }

    public static void capitalizeEverySecond(StringBuffer buffer) {
        for(int i = 0; i < buffer.length(); i+=2) {
            char currentChar = buffer.charAt(i);
            if(Character.isLetter(currentChar)) {
                buffer.setCharAt(i, Character.toUpperCase(currentChar));
            }
        }
    }
}
