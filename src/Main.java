public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread();
        bread.setName("Буханка обыкновенная");
        bread.setWeight(500);
        bread.setPrice(20);
        bread.setProducerCompany("KutNanKG");
        bread.bake();
        bread.pack();
        System.out.println();

        Lepeshka lepeshka = new Lepeshka(600, 35);
        lepeshka.setName("Лепешка из тандыра");
        lepeshka.drawPrints();
        lepeshka.bake();
        lepeshka.varnish();
        lepeshka.pack();
        lepeshka.setPrice(30);
        System.out.println();

        Lavash lavash = new Lavash();
        lavash.setName("Элитный лаваш из Дилижана");
        lavash.bake();
        lavash.wrapItUp();
        System.out.println();

        Baguette baguette = new Baguette(50, 5);
        baguette.setName("Провансальский багет");
        baguette.scarring();
        baguette.bake();
        baguette.pack();
        System.out.println();
        System.out.println(bread.getName());
        System.out.println(lepeshka.getName());
        System.out.println(lavash.getName());
        System.out.println(baguette.getName());

    }
}