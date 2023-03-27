public class Chicken extends Bird implements BirdFlight{


    protected Chicken(int height, int weight, String colorEye, int flightAltitude) {
        super(height, weight, colorEye, flightAltitude);
    }

    @Override
    public void toFlight() {
        System.out.printf("Я лечу на %d метрах", super.getFlightAltitude());

    }

    @Override
    public void animalSay() {
        System.out.println("Курица  - кудах-тах-тах");
    }

    @Override
    public String toString() {
        return String.format("Курица;  %s", super.toString());
    }

}