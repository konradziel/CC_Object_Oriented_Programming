public class Wariant_413 {
    public static void main(String[] args) {
        Car2 car = new Car2();
        car.setHorsePower(116);
        System.out.println(car.upgradeEngine(27));
    }
}

class Car2 {
    private int horsePower;

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String upgradeEngine(int bonusHorsePower) {
        horsePower += bonusHorsePower;
        return "Your engine after upgrade have " + horsePower + " horse power";
    }

}
