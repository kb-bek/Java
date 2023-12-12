package OOP;

public class Inheritance {
    public static void main(String[] args) {

        Programmer programmer1 = new Programmer();
        programmer1.firstName = "Erlich";
        programmer1.lastName = "Bachman";
        programmer1.salary = 100000;
        programmer1.bonus = 20000;
        programmer1.getInfo();
        programmer1.work();
        programmer1.duty();

    }
}

class Employee {
    String firstName;
    String lastName;
    int salary;

    void getInfo() {
        System.out.println(firstName + " " + lastName + "\n" +
                            "Salary: " + salary + " $\n"
                );
    }

    void work() {
        System.out.println(firstName + " " + lastName + " is working");
    }

    void duty() {}
}


class Programmer extends Employee {
    String role = "Programmer";
    int bonus;

    void getInfo() {
        System.out.println(firstName + " " + lastName + "\n" +
                "Role: " + role + "\n"+
                "Salary: " + salary + "$\n" +
                "Bonus: " + bonus + "$"
        );
    }

    void duty() {
        System.out.println("Provides support for the implementation of programs and software");
    }
}





