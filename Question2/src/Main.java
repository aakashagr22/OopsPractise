//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    Write a Java program to create a class called "Dog" with a name and breed attribute.
//    Create two instances of the "Dog" class, set their attributes using the constructor
//    and modify the attributes using the setter methods and print the updated values.
    Dog d1 = new Dog("Bulldog");
    Dog d2=  new Dog("German");
    d1.setBreed("German");
    System.out.println(d1.getBreed());
    d2.setBreed("Bulldog");
    System.out.println(d2.getBreed());
}
