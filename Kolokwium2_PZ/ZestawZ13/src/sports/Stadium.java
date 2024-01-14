package sports;

import java.util.Objects;

public class Stadium {
    private String name;
    private String location;
    private int capacity;
    private String homeTeam;

    public Stadium(String name, String location, int capacity, String homeTeam) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.homeTeam = homeTeam;
    }

    public Stadium() {
    }

    public Stadium(Stadium stadium) {
        this.name = stadium.name;
        this.location = stadium.location;
        this.capacity = stadium.capacity;
        this.homeTeam = stadium.homeTeam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stadium stadium = (Stadium) o;

        if (capacity != stadium.capacity) return false;
        if (!Objects.equals(name, stadium.name)) return false;
        if (!Objects.equals(location, stadium.location)) return false;
        return Objects.equals(homeTeam, stadium.homeTeam);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + capacity;
        result = 31 * result + (homeTeam != null ? homeTeam.hashCode() : 0);
        return result;
    }
}
