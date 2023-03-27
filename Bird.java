public abstract class Bird extends Animal{
    protected int flightAltitude;

    public int getFlightAltitude() {
        return this.flightAltitude;
    }

    protected Bird(int height, int weight, String colorEye, int flightAltitude) {
        super(height, weight, colorEye);
        this.flightAltitude = flightAltitude;
    }

    public abstract void toFlight();
}