package Homework5;

public class Person {
    private String Name;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;
    private String persArray[];

    public Person(String Name,String position, String email, String phoneNumber, int salary, int age) {
        this.Name = Name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void move(){
        System.out.printf("Cотрудник: %s Должность: %s email: %s Телефон: %s Зарплата: %s Возраст: %s %n", Name, position, email, phoneNumber, salary, age);
    }
}


