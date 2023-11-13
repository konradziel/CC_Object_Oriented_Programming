package pl.edu.uwm.a1;

import java.util.ArrayList;

public class TestWorkTool {
    public static void main(String[] args) {
        ArrayList<WorkTool> tab = new ArrayList<WorkTool>();

        tab.add(new Saw("saw1", 2000));
        tab.add(new Screwdriver("sd1", 2012));
        tab.add(new Saw("saw2", 2021));
        tab.add(new Hammer("hammer1", 2015));
        tab.add(new Hammer("hammer2", 2016));

        for(WorkTool elem : tab) {
            elem.use();
        }
    }
}
