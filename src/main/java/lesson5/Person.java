package lesson5;

public class Person {
    private String name;
    private String prof;
    private String email;
    private String phone;
    private int selary;
    private final int age;


    public Person(String name, String prof, String email, String phone, int selary, int age) {
        this.name = name;
        this.prof = prof;
        this.email = email;
        this.phone = phone;
        this.selary = selary;
        this.age = age;
    }
    public void getInfo() {
        System.out.println("----------------------------");
        System.out.println("Имя :" + name + "\n" +
                           "Долдность :"+ prof + "\n" +
                            "EMAIL :" + email + "\n" +
                           "Телефон :" + selary + "\n" +
                            "Возраст :" + age);

    }

    public int getAge() {
        return age;
    }
}
