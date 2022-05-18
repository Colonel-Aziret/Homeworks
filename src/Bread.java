public class Bread {
    double weight;
    double price;
    String name;
    String producerCompany;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducerCompany() {
        return producerCompany;
    }

    public void setProducerCompany(String producerCompany) {
        this.producerCompany = producerCompany;
    }

    void bake() { // Испечь
        System.out.println("Испечь хлеб");
    }

    void pack() { // Упаковать
        System.out.println("Упаковать хлеб");
    }
}
