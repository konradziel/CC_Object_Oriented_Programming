package utilities;

import java.util.ArrayList;

public class TestAFE {
    public static void main(String[] args) {
        ArrayList<Object> destinationList = new ArrayList<>();
        ArrayList<String> sourceList = new ArrayList<>();

        sourceList.add("One");
        sourceList.add("Two");
        sourceList.add("Three");

        AFE.appendFromEnd(destinationList, sourceList);

        System.out.println("Destination List after appending from end: " + destinationList);
    }
}
