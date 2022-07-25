package i3.client;
import java.util.Hashtable;
import java.util.Scanner;

import i3.logic.Bill;
import i3.logic.CustomerDetails;
import i3.logic.Menu;
import i3.logic.OfferPolicy;
import i3.logic.Order;
import i3.logic.Table;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		Menu m = new Menu();
		int ch=0;
		int och=0;
		int cust;
	    CustomerDetails c = new CustomerDetails();
	    Table t = new Table();
	    Order o = new Order();
	    OfferPolicy of = new OfferPolicy();
	    Bill b = new Bill();
	    do {
	    	
	    	 System.out.println("\nEnter the phone number: ");
	 	    long p = inp.nextLong();
	 	    System.out.println("Enter the customer capacity");
	 	     cust = inp.nextInt();
	 	   c.addANode(c, p, cust);
	 	  System.out.println("\nTable alloted is: "+t.tableAllotmentSystem(cust));
	 	  m.addDishes();
	 	  do {
	 		 o.addorder();
	 	 	 System.out.println("\nDo you want to order more?\n1.Yes\n2.No");
	 	 	 och=inp.nextInt();
	 	  }while(och!=2);
	 	
	 double grandtotal=	b.computeGrandTotal(o.computeSubTotal(), of.computeDiscount(o.computeSubTotal()));
	 	System.out.println("GrandTotal: "+grandtotal);
	 	System.out.println("-----------------------------------");
	 	o.removeOrder();
	 	  
	 	    System.out.println("\nAre there more customers?\n1.Yes\n2.No");
	 	    ch = inp.nextInt();
	    	
	    }while(ch!=2);
	    
	}

}
