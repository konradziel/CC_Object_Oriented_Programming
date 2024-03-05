package pl.edu.uwm.a1;

public class Saw extends WorkTool {
    public Saw(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use() {
        System.out.println(getName() + " is saw.");
    }
}
