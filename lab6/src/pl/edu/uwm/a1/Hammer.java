package pl.edu.uwm.a1;

public class Hammer extends WorkTool {
    public Hammer(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println(getName() + " is hammer.");
    }
}
