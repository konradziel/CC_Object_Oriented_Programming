package pl.edu.uwm.zad17;

import java.util.ArrayList;

public class VolleyballTeam extends Team {
    private int numberOfVictories;

    public VolleyballTeam(String name, String city, ArrayList<Integer> points, int numberOfVictories) {
        super(name, city, points);
        this.numberOfVictories = numberOfVictories;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public String toString() {
        return "VolleyballTeam{" +
                "numberOfVictories=" + numberOfVictories +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        VolleyballTeam that = (VolleyballTeam) o;

        return numberOfVictories == that.numberOfVictories;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfVictories;
        return result;
    }
}
