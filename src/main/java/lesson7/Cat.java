package lesson7;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public boolean getSatiety() {
        return satiety;
    }
    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }
    public boolean eat(Plate plate) {
        String vlidateMessage = cheakEat(plate);
        if(vlidateMessage != null) {
            System.out.println(vlidateMessage);
            return false;
        }
        doEat(plate);
        satiety = true;
        return true;
    }

    private void doEat(Plate plate) {
        plate.decreacFood(appetite);
    }

    private String cheakEat(Plate plate) {
        if(!plate.isFoodEnogh(appetite)) {
            return "Еды на всех не хватило!!!!";
        }
        if(satiety) {
            return "Кот уже сыт";
        }
        return null;
    }

    public void printInfo(Cat...cats) {
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Кот: " + cats[i].name + "\n" + "Cытость: " + cats[i].appetite + "\n" + "Голоден :" + satiety);
        }

    }

}
