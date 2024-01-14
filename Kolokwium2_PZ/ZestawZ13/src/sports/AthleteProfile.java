package sports;

import java.util.Objects;

public class AthleteProfile {
    private String athleteName;
    private String sport;
    private Stadium stadium;

    public AthleteProfile(String athleteName, String sport, Stadium stadium) {
        this.athleteName = athleteName;
        this.sport = sport;
        this.stadium = (stadium==null)?new Stadium(): new Stadium(stadium);;
    };

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public Stadium getStadium() {
        return new Stadium(stadium);
    }

    public void setStadium(Stadium stadium) {
        this.stadium = (stadium==null)?new Stadium(): new Stadium(stadium);
    }

    @Override
    public String toString() {
        return "AthleteProfile{" +
                "athleteName='" + athleteName + '\'' +
                ", sport='" + sport + '\'' +
                ", stadium=" + stadium +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AthleteProfile that = (AthleteProfile) o;

        if (!Objects.equals(athleteName, that.athleteName)) return false;
        if (!Objects.equals(sport, that.sport)) return false;
        return Objects.equals(stadium, that.stadium);
    }

    @Override
    public int hashCode() {
        int result = athleteName != null ? athleteName.hashCode() : 0;
        result = 31 * result + (sport != null ? sport.hashCode() : 0);
        result = 31 * result + (stadium != null ? stadium.hashCode() : 0);
        return result;
    }
}

