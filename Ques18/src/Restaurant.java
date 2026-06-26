import java.util.ArrayList;

public class Restaurant {
//    Write a Java program to create a class called "Restaurant" with attributes
//    for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.

   static class Menu {
        private String itemName;
        private int price;
        private int rating;

        Menu(int p, int r, String itemName) {
            this.price = p;
            this.rating = r;
            this.itemName = itemName;

        }
        private ArrayList<Menu> items;
       public static  void addItems(){
items.add;
       }

        public int getPrice() {
            return price;
        }

        public int getRating() {
            return rating;
        }


        public void setPrice(int price) {
            this.price = price;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }
    }

}