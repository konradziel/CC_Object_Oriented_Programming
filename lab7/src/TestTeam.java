import pl.edu.uwm.zad17.*;

import java.util.ArrayList;

public class TestTeam {
    public static void main(String[] args) {
        ArrayList<Integer> points1 = new ArrayList<>();
        points1.add(1);
        points1.add(2);
        ArrayList<Integer> points2 = new ArrayList<>();
        points2.add(1);
        points2.add(0);

        Team team1 = new Team("asd", "dsa", points1);
        Team team2 = new Team("asd", "dsa", points1);
        System.out.println(team1.equals(team2));
        team2.setPoints(points2);
        System.out.println(team1.equals(team2));

        SoccerTeam sc1 = new SoccerTeam("asd", "dsa", points2, 2);
        SoccerTeam sc2 = new SoccerTeam("asd", "dsa", points1, 1);
        System.out.println(sc1.hashCode()==sc2.hashCode());
        System.out.println(sc1.equals(sc2));

        VolleyballTeam vt1 = new VolleyballTeam("asd", "dsa", points1, 1);
        VolleyballTeam vt2 = new VolleyballTeam("asd", "dsa", points2, 0);
        System.out.println(vt1.hashCode()==vt2.hashCode());
        System.out.println(vt1.getCity());
        System.out.println(vt1.getNumberOfVictories());
        System.out.println(vt2.getName());
        System.out.println(vt2.getPoints());
    }
}
