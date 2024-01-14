package vacation;

public interface TravelPlanner {
    void planRoute(String destination);

    default void cancelTrip(){
        System.out.println("Trip Cancelled");
    }

    static String getTravelMode(){
        return "TravelMode";
    }
}
