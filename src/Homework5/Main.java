package Homework5;

public class Main {

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 35);
        persArray[1] = new Person("Petrov Petr", "Vice Director", "petpetr@mailbox.com", "8913456342", 35000, 28);
        persArray[2] = new Person("Kuznetsov Evgenii", "Director", "kuzevgenii@mailbox.com", "846546312", 40000, 26);
        persArray[3] = new Person("Popov Anton", "Vice president", "popanton@mailbox.com", "8345612312", 60000, 43);
        persArray[4] = new Person("Smith John", "President", "smithjohn@mailbox.com", "83452312", 300000, 48);

        filter(persArray);
    }

    static void filter(Person[] persArray){
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40){
                persArray[i].move();
            }
        }
    }
}
