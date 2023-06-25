import java.util.Objects;

public class Cat {
    private String name; // поле, содержащее имя кота
    private int appetite; // аппетит кота (столько он съедает за раз)
    private int satiety; // сытость (голодный или нет)

    public Cat(String name, int appetite, int satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    // getter
    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        int newFood = plate.decreaseFood(appetite / 10 * (10 - satiety));
        if (newFood == -1) {
            satiety = 10;
        } else {
            satiety = ((appetite - newFood) * 10) / appetite;
        }
    }

    @Override
    public String toString() {
        return name + " [" + appetite + "], " + "satiety:" + satiety;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Cat anotherCat) {
//            hw_6.Cat anotherCat = (hw_6.Cat) obj; // cast
            return name.equals(anotherCat.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // if obj1.equals(obj2) => obj1.hashcode() == obj2.hashcode()

    //    // setter
//    public void setName(String catName) {
//        name = catName;
//    }


}
