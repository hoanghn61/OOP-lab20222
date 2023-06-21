package hust.soict.cybersec.test.cart;

import hust.soict.cybersec.aims.cart.Cart;
import hust.soict.cybersec.aims.media.DigitalVideoDisc;


public class CartTest {
    public static void main(String[] args){
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);
        
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addMedia(dvd3);
        //Test the print method
        
        
        System.out.print("Total: "+ cart.totalCost());
        //To-do: Test the search methods here
    }
}