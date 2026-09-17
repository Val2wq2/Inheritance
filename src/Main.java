// https://github.com/Val2wq2/Inheritance
public class Main {
    public static void main(String[] args) {
        // Create two Person object
        Person p1 = new Person();

//        Person p2 = new Person(72, 70, "Black","Barack Obama",170);
//        System.out.println(p2.name);
        Person p2 = new Person(72, 70);
        System.out.println(p2.age);

        Person p3 = p2.Call_Private();

        Student s1 = new Student();
        s1.age = 20;
        s1.gpa = 4.00;
        System.out.println(s1.gpa);
    }
}