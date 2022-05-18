public class Baguette extends Bread {
    int length;
    int numberOfLongitudinalScars; // Количество продольных рубцов

    public Baguette(int length, int numberOfLongitudinalScars) {
        this.length = length;
        this.numberOfLongitudinalScars = numberOfLongitudinalScars;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNumberOfLongitudinalScars() {
        return numberOfLongitudinalScars;
    }

    public void setNumberOfLongitudinalScars(int numberOfLongitudinalScars) {
        this.numberOfLongitudinalScars = numberOfLongitudinalScars;
    }

    void scarring() {   // Рубцевать
        System.out.println("Рубцевать багет");
    }

    @Override
    void pack() {
        System.out.println("Упаковать багет");
        System.out.println("Только в экологичный пакет");
    }
}
