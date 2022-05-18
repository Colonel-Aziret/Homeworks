public class Lavash extends Bread {

    void wrapItUp() {   // Завернуть
        System.out.println("Завернуть");
    }

    @Override
    void bake() {
        System.out.println("Испечь лаваш");
        System.out.println("Я лаваш, меня испекли");
    }
}
