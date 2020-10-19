package hw7;

public class MainSeven {
    public static void main(String[] args) {
        Cat[] cat = {
                new Cat("Мурзик", 15),
                new Cat("Барсик", 34),
                new Cat("Рыжик", 25),
                new Cat("Муся", 40)
        };

        Plate plate = new Plate(70);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
        }
        System.out.println(plate);

        plate.fill(100);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
        }

        System.out.println(plate);
    }
}
