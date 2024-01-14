package healthcare;

public class TestHospital {
    public static void main(String[] args) throws CloneNotSupportedException {
        Hospital hospitalOne = new Hospital("Main Hospital", 120.0);
        Hospital hospitalTwo = new Hospital(null,  -40 );

        System.out.println(hospitalOne);
        System.out.println(hospitalTwo);

        hospitalTwo = hospitalOne.clone();

        System.out.println(hospitalTwo);
    }
}
