package hw7;

public class Cat {
    private String name;
    private int full;

    public Cat(String name, int full) {
        this.name = name;
        this.full = full;
    }

    public void eat(Plate plate){
        if (full < 0 || full > 100) {
            System.out.println("У " + name + " не реальный аппетит!!!");
            return;
        }

        hungerCat(plate);
    }

    public void hungerCat(Plate plate){
        if(plate.eating(full)){
            System.out.println(name + " покушал, он сыт!");
        } else{
            System.out.println(name + " не хватило еды, он остался голоден.");
        }

    }
}
