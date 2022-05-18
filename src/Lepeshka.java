public class Lepeshka extends Bread {
    double radius;

    public Lepeshka(double weight, double radius) {
        if (weight > 200)
            setWeight(weight);
        else {
            System.out.println("Лепешка подделка");
        }
        this.radius = radius;
    }

    public Lepeshka() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    void bake() {
        System.out.println("Испечь лепешку");
    }

    void pack() {
        System.out.println("Упаковать лепешку");
    }

    void drawPrints() {   // Нанести узоры
        System.out.println("Нанести узоры на лепешку");
    }

    void varnish() {   // Лакировать
        System.out.println("Лакировать лепешку");
    }
}
