package com.adventure.akt;

public class Excursion {
    private String spot;
    private double budget;

    public Excursion(String spot, double budget) {
        this.spot = spot;
        this.budget = budget >= 0 ? budget : 20.00;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public void setBudget(double budget) {
        this.budget = budget >= 0 ? budget : this.budget;
    }

    public String getSpot() {
        return spot;
    }

    public double getBudget() {
        return budget;
    }
}
