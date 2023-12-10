package polaMetodyKlasyFinalne.zad5;

public class Television extends Electronics{
    // void turnOn() {
    //     System.out.println("Telewizor włączony");
    // }
    // Próba przesłonięcia metody turnOn spowoduje błąd kompilacji
    // metoda w klasie bazowej jest oznaczona jako final
    // nie można jej przesłonić w klasie potomnej.
    // próba kompilacji spowoduje błąd: "cannot override final method"
}
