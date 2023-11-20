import pl.edu.uwm.zad7.Base;
import pl.edu.uwm.zad7.Child;

public class TestBase {
    public static void main(String[] args) {
        Base base = new Base();
        Child child = new Child();
        base.info();
        child.info();
    }

}

//Metody statyczne są związane z klasą, a nie instancją obiektu.
//Definiując metodę o tej samej nazwie w klasie potomnej nie przesyłamy metody,
//a przesłaniamy metodę z klasy bazowej.
