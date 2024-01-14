package vacation;

public class TravelTester {
    public static void main(String[] args) {
        RoadTripPlanner rtp = new RoadTripPlanner();
        FlightPlanner fp = new FlightPlanner();

        rtp.planRoute("Paris");
        fp.planRoute("New York");

        rtp.cancelTrip();
        fp.cancelTrip();

        System.out.println(TravelPlanner.getTravelMode());

    }
}
