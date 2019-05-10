package chap05;

class Person {
    String name;
    String id;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    String department;

    public Student(String name) {
        super(name);
    }
}


public class UpcastingEx {
    public static void main(String[] args) {
        Person  person;
        Student student = new Student("BTS");
        person = student;

        System.out.println(person.name);
    }
}
