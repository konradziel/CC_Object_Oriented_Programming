package pl.edu.uwm.zad17;

import java.util.ArrayList;

public class SoccerTeam extends Team {
    private int rankingPosition;

    public SoccerTeam(String name, String city, ArrayList<Integer> points, int rankingPosition) {
        super(name, city, points);
        this.rankingPosition = rankingPosition;
    }

    public int getRankingPosition() {
        return rankingPosition;
    }

    public void setRankingPosition(int rankingPosition) {
        this.rankingPosition = rankingPosition;
    }

    @Override
    public String toString() {
        return "SoccerTeam{" +
                "rankingPosition=" + rankingPosition +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        SoccerTeam that = (SoccerTeam) o;

        return rankingPosition == that.rankingPosition;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + rankingPosition;
        return result;
    }
}
