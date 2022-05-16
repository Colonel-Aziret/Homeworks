package OOP;

public class TaskB {
    public static void main(String[] args) {

        // Задача B. Создание классов самостоятельно

        Dota2Heroes hero1 = new Dota2Heroes();
        hero1.nameOfHero = "Invoker";
        hero1.mainCharacteristic = "intelligence";
        hero1.isMeleeTypeOfAttack = false;
        hero1.numberOfAbilities = 10;

        if (hero1.isMeleeTypeOfAttack) {
            System.out.printf("My name is %s, and the spheres light my way. Also I am a melee %s hero with %d ability. \n", hero1.nameOfHero, hero1.mainCharacteristic, hero1.numberOfAbilities);
        } else {
            System.out.printf("My name is %s, and the spheres light my way. Also I am a ranged %s hero with %d ability. \n", hero1.nameOfHero, hero1.mainCharacteristic, hero1.numberOfAbilities);
        }

        Dota2Heroes hero2 = new Dota2Heroes();
        hero2.nameOfHero = "Ember Spirit";
        hero2.mainCharacteristic = "ability";
        hero2.isMeleeTypeOfAttack = true;
        hero2.numberOfAbilities = 6;

        if (hero2.isMeleeTypeOfAttack) {
            System.out.printf("My name is %s, and I'm walking towards my destiny. Also I am a melee %s hero with %d ability. \n", hero2.nameOfHero, hero2.mainCharacteristic, hero2.numberOfAbilities);
        } else {
            System.out.printf("My name is %s, and I'm walking towards my destiny. Also I am a ranged %s hero with %d ability. \n", hero2.nameOfHero, hero2.mainCharacteristic, hero2.numberOfAbilities);
        }


        Dota2Heroes hero3 = new Dota2Heroes();
        hero3.nameOfHero = "Pudge";
        hero3.mainCharacteristic = "strength";
        hero3.isMeleeTypeOfAttack = true;
        hero3.numberOfAbilities = 4;

        if (hero3.isMeleeTypeOfAttack) {
            System.out.printf("My name is %s, and I love meat. Also I am a melee %s hero with %d ability. \n", hero3.nameOfHero, hero3.mainCharacteristic, hero3.numberOfAbilities);
        } else {
            System.out.printf("My name is %s, and I love meat. Also I am a ranged %s hero with %d ability. \n", hero3.nameOfHero, hero3.mainCharacteristic, hero3.numberOfAbilities);
        }
    }
}
