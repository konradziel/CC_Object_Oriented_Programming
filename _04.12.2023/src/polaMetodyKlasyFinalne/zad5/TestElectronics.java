package polaMetodyKlasyFinalne.zad5;

public class TestElectronics {
    public static void main(String[] args) {
        Electronics electronicDevice = new Electronics();
        electronicDevice.turnOn();

        Television television = new Television();
        // television.turnOn();
        // Próba wywołania metody turnOn z klasy Television
        // Spowoduje błąd kompilacji ze względu na oznaczenie metody turnOn jako finalnej
    }
}
