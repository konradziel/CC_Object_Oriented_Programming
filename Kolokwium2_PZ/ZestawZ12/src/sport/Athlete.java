package sport;

import java.util.Arrays;

public class Athlete implements Cloneable{
    private String name;
    private double[] times;

    public Athlete(String name, double[] times) {
        this.name = name;
        this.times = times!=null ? times : new double[5];
    }

    public double[] getTimes() {
        return times.clone();
    }

    public void setTimes(double[] times) {
        this.times = times.clone();
    }

    @Override
    public Athlete clone() throws CloneNotSupportedException {
        Athlete athlete = (Athlete) super.clone();
        athlete.times = times.clone();
        return athlete;
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", times=" + Arrays.toString(times) +
                '}';
    }

    public void setTimeAtPosition(double time, int position) {
        if (position>times.length || position<=0) throw new IllegalArgumentException("Position must be between 1 and " + times.length);

        double[] temp = times.clone();
        temp[position-1] = time;
        times = temp;
    }
}
