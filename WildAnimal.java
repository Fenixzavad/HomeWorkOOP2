public abstract class WildAnimal extends Animal{
    private String place;
    private String date;

    protected WildAnimal(int height, int weight, String colorEye, String place, String date) {
        super(height, weight, colorEye);
        this.place = place;
        this.date = date;
    }

    @Override
    public abstract void animalSay();

    @Override
    public String toString() {
        return String.format("Ареал Обитания:  %s; Дата нахождения:  %s; %s", 
        this.place, this.date, super.toString());
    }
}
