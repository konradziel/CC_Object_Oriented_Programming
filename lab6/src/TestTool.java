import pl.edu.uwm.zad3.Hammer;
import pl.edu.uwm.zad3.Tool;

public class TestTool {
    public static void main(String[] args) {
        Tool t1 = Tool.createTool("Tool");
        Hammer t2 = Hammer.createHammer("Hammer");
    }
}

//Metody prywatne nie są dziedziczone i są ukryte dla klas dziedziczących.