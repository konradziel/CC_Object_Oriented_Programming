package programowanieGeneryczne.zad29;

public class Tree extends Plant {
    private double height;

    public Tree(double height) {
        this.height = height;
    }

    public Tree() {

    }

    public double getHeight() {
        return height;
    }

    public int compareTo(Tree other) {
        return Double.compare(this.height, other.height);
    }

    @Override
    public String toString() {
        return "height: " + height;
    }
}
