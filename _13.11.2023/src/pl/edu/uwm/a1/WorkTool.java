package pl.edu.uwm.a1;

public abstract class WorkTool {
    private String name;
    private int productionYear;

    public WorkTool(String name, int productionYear) {
        this.name = name;
        this.productionYear = productionYear;
    }

    public abstract void use();

    public String getName() {
        return name;
    }

    public int getProductionYear() {
        return productionYear;
    }
}
