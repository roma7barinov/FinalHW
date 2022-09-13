package lesson5;

public class MainApp {
    public static void main(String[] args) {

        Person[] persArr = new Person[5];
        persArr[0] = new Person("Georg","engener","roma7barinov@mail.ru","89611514142",1203,21);
        persArr[1] = new Person("toly","engener","roma7barinov@mail.ru","89611514142",2300,23);
        persArr[2] = new Person("mani","engener","roma7barinov@mail.ru","89611514142",1600,48);
        persArr[3] = new Person("julia","teacher","roma7barinov@mail.ru","89611514142",800,60);
        persArr[4] = new Person("lera","shop","roma7barinov@mail.ru","89611514142",500,18);

        for (int i = 0; i < persArr.length ; i++) {
            if(persArr[i].getAge() > 40) {
                persArr[i].getInfo();
            }
        }
    }
}
