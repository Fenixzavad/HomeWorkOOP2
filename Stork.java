public class Stork extends Bird implements BirdFlight{

    protected Stork(int height, int weight, String colorEye, int flightAltitude) {
        super(height, weight, colorEye, flightAltitude);
    }

    @Override
    public void toFlight() {
        System.out.printf("Я лечу на высоте %d метров", super.getFlightAltitude());


    }

    @Override
    public void animalSay() {
        System.out.println("Аист - клокочет");

    }

    @Override
    public String toString() {
        return String.format("Аист;  %s", super.toString());
    }

} 
    

