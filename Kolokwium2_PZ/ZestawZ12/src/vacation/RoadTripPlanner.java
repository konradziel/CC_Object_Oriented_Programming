package vacation;

public class RoadTripPlanner implements TravelPlanner{

    @Override
    public void planRoute(String destination) {
        System.out.println("Planning Road Trip to " + destination);
    }
}
