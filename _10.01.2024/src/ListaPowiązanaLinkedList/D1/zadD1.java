package ListaPowiązanaLinkedList.D1;

import java.util.LinkedList;

public class ZadD1 {
    public static void main(String[] args) {
        LinkedList<Integer> palindromeList = new LinkedList<>();
        palindromeList.add(1);
        palindromeList.add(2);
        palindromeList.add(3);
        palindromeList.add(2);
        palindromeList.add(1);

        LinkedList<Integer> nonPalindromeList = new LinkedList<>();
        nonPalindromeList.add(1);
        nonPalindromeList.add(2);
        nonPalindromeList.add(3);

        Alg5 alg = new Alg5();
        System.out.println("Is palindrome? " + alg.isPalindrome(palindromeList));
        System.out.println("Is palindrome? " + alg.isPalindrome(nonPalindromeList));
    }
}
