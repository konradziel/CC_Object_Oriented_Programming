package Kopiowanie_Obiektów.zad11;

import java.util.Arrays;

public class Athlete implements  Cloneable{
    private String name;
    private double[] times;

    public Athlete(String name, double[] times) {
        this.name = name;
        this.times = times!=null ? times.clone(): new double[0];
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", times=" + Arrays.toString(times) +
                '}';
    }

    public Athlete clone() throws CloneNotSupportedException {
        Athlete athlete = (Athlete) super.clone();
        athlete.times = times.clone();
        return athlete;
    }

    public double[] getTimes() {
        return times.clone();
    }

    public void setTimes(double[] times) {
        this.times = times.clone();
    }

    public void setTimeAtPosition(double timeAt, int position) {
        var temp = times.clone();
        temp[position-1] = timeAt;
        times = temp;
    }
}
