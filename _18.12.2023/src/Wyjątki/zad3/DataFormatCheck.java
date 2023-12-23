package Wyjątki.zad3;

public class DataFormatCheck {
    public static void main(String[] args) {
        try {
            String inputData1 = "correctData";
            String inputData2 = "invalid_data";
            checkDataFormat(inputData1);
            checkDataFormat(inputData2);
        } catch (InvalidDataFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void checkDataFormat(String data) throws InvalidDataFormatException {
        if (!data.matches("[a-zA-Z0-9]+")){
            throw new InvalidDataFormatException("Invalid data format.");
        }
        else {
            System.out.println("Data format is correct.");
        }
    }
}
