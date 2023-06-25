
public class Homework {

    /**
     * Добавить в кота следующее. Пусть голод кота оценивается не true\false, а по шкале (1, 2, ..., 10).
     * Кот хочет съесть то количество еды, каков его текущий голод. Например, если аппетит кота = 100, а голод 5, то он съест 50.
     * Кот съедает все, что есть в тарелке. Например, в тарелке 50, коту нужно 70, он съест 50.
     * <p>
     * Пример.
     * Кот, его аппетит = 100
     * Пусть кот сыт наполовину, то есть его голод = 5. То есть, ему нужно 50 единиц еды.
     * Пусть в тарелке 25 единиц еды.
     * После обеда, сытость кота будет равна 7, а еда в тарелке закончится.
     */

    public static void main(String[] args) {
        Cat murzik = new Cat("Murzik", 200, 0);
        Plate plate = new Plate(50);

        System.out.println(murzik);
        System.out.println(plate);
        murzik.eat(plate);
        System.out.println(murzik);
        plate.increaseFood(45);
        System.out.println(plate);
        murzik.eat(plate);
        System.out.println(murzik);
        plate.increaseFood(79);
        System.out.println(plate);
        murzik.eat(plate);
        System.out.println(murzik);
        plate.increaseFood(55);
        System.out.println(plate);
        murzik.eat(plate);
        System.out.println(murzik);
        plate.increaseFood(111);
        System.out.println(plate);
        murzik.eat(plate);
        System.out.println(murzik);
        System.out.println(plate);

        Cat barsik = new Cat("Barsik", 100, 0);

        System.out.println(barsik);
        barsik.eat(plate);
        System.out.println(plate);
        System.out.println(barsik);
        plate.increaseFood(30);
        barsik.eat(plate);
        System.out.println(plate);
        System.out.println(barsik);
        barsik.eat(plate);
        System.out.println(plate);
        System.out.println(barsik);

        Cat kuzya = new Cat("Kuzya", 50, 0);

        System.out.println(kuzya);
        kuzya.eat(plate);
        System.out.println(plate);
        System.out.println(kuzya);
        kuzya.eat(plate);
        System.out.println(plate);
        System.out.println(kuzya);

    }

}
