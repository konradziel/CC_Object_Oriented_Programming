package pl.edu.uwm.zad21;

public class Manager extends Employee1 {
    private double bonus;

    public Manager(String name, String department, double salary, double bonus) {
        super(name, department, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "bonus=" + bonus +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Manager manager = (Manager) o;

        return Double.compare(bonus, manager.bonus) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(bonus);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
