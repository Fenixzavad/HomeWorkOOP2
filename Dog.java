public class Dog extends HomeAnimal {
    private final String training;

    protected Dog(String name, String breed, String vaccination, String color, String dateBirthday, int height,
            int weight, String colorEye, String training) {
        super(name, breed, vaccination, color, dateBirthday, height, weight, colorEye);
        this.training = training;

    }

    @Override
    public void animalSay() {
        System.out.println("Собака - Гав-гав");

    }

    public void doTraining(){
        System.out.println("Дрессировать");
    }

    @Override
    public String toString() {
        return String.format("Собака;  %s; Дрессировка:  %s", super.toString(), this.training);
       }

    @Override
    public void caressing() {
        System.out.println("Поиграть с собакой, погладить");
    }
}
