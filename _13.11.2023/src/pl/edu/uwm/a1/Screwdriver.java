package pl.edu.uwm.a1;

public class Screwdriver extends WorkTool {
    public Screwdriver(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    public void use(){
        System.out.println(getName() + " is screwdriver.");
    }
}
