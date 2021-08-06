package Homework_3;

public class Lesson_3 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",30000,30);
        persArray[1] = new Person("Petrov Petr", "CEO", "pepetr@mailbox.com", "892312313",200000,44);
        persArray[2] = new Person("Stepanov Stepan", "WarehouseManager", "stestepan@mailbox.com", "892312314",70000,51);
        persArray[3] = new Person("Lenina Elena", "Accountant", "lenelena@mailbox.com", "892312315",30000,24);
        persArray[4] = new Person("Annina Anna", "Supervisor", "ananna@mailbox.com", "892312316",50000,29);
        for (Person person : persArray)
            if (person.getAge()>40)
                System.out.println(person);

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
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}
