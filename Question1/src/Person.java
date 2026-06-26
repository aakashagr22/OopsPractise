public class Person {
//    Write a Java program to create a class called "Person" with a name and age attribute.
//    Create two instances of the "Person" class, set their attributes using the constructor,
//    and print their name and age.

    private String name;
    private int age;
    Person(String nam, int ag){
        this.name = nam;
        this.age=  ag;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
