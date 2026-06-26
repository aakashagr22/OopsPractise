import java.util.ArrayList;

public class BookCollectionService {
    ArrayList<Book> collection = new ArrayList<>();
//    public BookCollectionService(){
//        super();
//    }
    public void  addBook(String title, String author,int ISBN,int i){
        collection.add(new Book(title,author,ISBN,i));
    }
    public void  removeBook(int i){
        for(Book b: collection){
           int actualId = b.getId();
           int userId=  i;
           if(actualId == userId){
        collection.remove(b);
        break;
        }
        }
    }
    public void getDetails(){
        for(Book n : collection){
            System.out.println("Title: "+n.getTitle()+" Author: "+ n.getAuthor()+ " ISBN: " + n.getISBN());
        }
    }

}
