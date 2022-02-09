package school.lesson3;

public class HW4 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892232112", 30000, 30);
        persArray[1] = new Person("Fedorov Andrey", "Auditor", "fedorand@mailbox.com", "892435478", 45000, 28);
        persArray[2] = new Person("Petrov Sergey", "Designer", "petrovsry@mailbox.com", "892556349", 51000, 44);
        persArray[3] = new Person("Orlov Graf", "Programmer", "orlov_gf@mailbox.com", "892202458", 33000, 37);
        persArray[4] = new Person("Alexandrov Peter", "Secretary", "alexpit@mailbox.com", "892763897", 29000, 41);
        for (Person person : persArray) if (person.getAge()>40) person.getInfo();
    }
}
class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    void getInfo() {
        System.out.println("Name: " + name + "\nPosition: " + position + "\nemail: " + email
                + "\nPhone: " + phone + "\nSalary: " + salary + "\nAge: " + age);
    }
    int getAge() {
        return age;
    }
}