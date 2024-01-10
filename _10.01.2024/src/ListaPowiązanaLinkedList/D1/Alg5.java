package ListaPowiązanaLinkedList.D1;

import java.util.LinkedList;

public class Alg5 {
    public <T> boolean isPalindrome(LinkedList<T> list) {
        int size = list.size();
        int halfSize = size / 2;

        for (int i = 0; i < halfSize; i++) {
            if (!list.get(i).equals(list.get(size - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
