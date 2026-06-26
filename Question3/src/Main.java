//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//    Write a Java program to create a class called "Book" with attributes for title, author,
//    and ISBN, and methods to add and remove books from a collection.
    BookCollectionService bsc = new BookCollectionService();
    bsc.addBook("The MindSet","Dr.Dweck",1,1);
    bsc.addBook("Stammering","Dr.Carol's Dweck",2,2);
    bsc.addBook("The X Factor","Dr.Carol's Levin",3,3);
    bsc.addBook("Motivation","Dr.Carol's ",4,4);
    bsc.getDetails();

}
