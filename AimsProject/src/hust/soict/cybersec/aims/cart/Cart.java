package hust.soict.cybersec.aims.cart;

import java.security.PublicKey;

import hust.soict.cybersec.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrders[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered > MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full!");
		}else {
			itemsOrders[qtyOrdered] = disc;
			qtyOrdered += 1;
			System.out.println("The disc has been added");
			
		}
	
		
	}
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		if (this.qtyOrdered + dvdList.length < MAX_NUMBERS_ORDERED) {
			for (int i = 0; i < dvdList.length; i++) {
				 itemsOrders[qtyOrdered] = dvdList[i];
				 qtyOrdered += 1;
			}
			System.out.println("The disc has been add");
			
		}else {
			System.out.println("The cart is full");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		addDigitalVideoDisc(disc1);
		addDigitalVideoDisc(disc2);
		
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		qtyOrdered -= 1;
		System.out.println("Success reomoval"); 

	}
	
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemsOrders[i].getCost();
			
		}return total;
		
		
	}
	
	public void printBill() {
		for( int i = 0; i < itemsOrders.length; i++) {
			System.out.println((i+1) + "." + "DVD"+ "-" + itemsOrders[i].getTitle() + "-" + itemsOrders[i].getCategory()+ "-"
                    + itemsOrders[i].getDirector() + " - " + "length: " +  itemsOrders[i].getLength() + " - " + "Price: "
                    + itemsOrders[i].getCost() + "$");
			
		}

		
	}
	
	
	

}
