package healthcare;

public class Hospital implements Cloneable{
    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
        this.name = name!=null ? name : "";
        this.capacity = capacity>0 ? capacity : 50.0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " +
                "name=" + name +
                ", capacity=" + capacity +
                '.';
    }

    @Override
    protected Hospital clone() throws CloneNotSupportedException {
        return (Hospital) super.clone();
    }
}
