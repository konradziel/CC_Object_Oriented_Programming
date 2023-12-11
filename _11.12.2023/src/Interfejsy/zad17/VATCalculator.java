package Interfejsy.zad17;

public interface VATCalculator {
    double vatRate = 0.23;
    static double calculateWithVat(double price){
        return price*(1.00+vatRate);
    }
}
