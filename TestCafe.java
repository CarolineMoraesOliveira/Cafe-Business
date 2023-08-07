import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        
    
    CafeUtil adminNotes = new CafeUtil();
    
    	
         /*  ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        
        System.out.printf("Purchases needed by week 10: %s \n\n", adminNotes.calculateReward(10));
    
        
        
        System.out.println("----- Order Total Test-----");
        //Place to the admin insert all the prices from an order
        
        
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n",adminNotes.getOrderTotal(lineItems));
    
        
        
        System.out.println("----- Display Menu Test-----");
        // Place to the admin insert menu items and display them 
        
        
        ArrayList<String> menu = new ArrayList<String>();
            menu.add("drip coffee");
            menu.add("cappuccino");
            menu.add("latte");
            menu.add("mocha");
            
            adminNotes.displayMenu(menu);


        System.out.println("\n----- Add Customer Test-----");
        // Place to the customer insert his/her name to app's reception and return to the customers 
        // how many people are in front
           

        ArrayList<String> customers = new ArrayList<String>();
       
        for (int i = 0; i < 4; i++) {
             adminNotes.addCustomer(customers);
             System.out.println("\n");
        }
    

        System.out.println("\n NINJA BONUS 1");
       // Place to insert the PRODUCT, the PRICE, and THE TOTAL VALUE based in the maximum quantity

        adminNotes.printPriceChart("Columbian Coffee Ground", 15.00, 1);
    
        System.out.println("\n NINJA BONUS 2");
        //

        System.out.println("\n NINJA BONUS 3");
        // Take $0.50 more off the original price every 
        //time the quantity increases.
        //price: $2.00 and max 4 products

        adminNotes.discountFromTwo(2.00, 0.50, 4);

        System.out.println("\n BOOLEAN DISPLAY MENU");
        //Giving MENU ITEMS and PRICES; display a MENU;

        ArrayList <Double> prices = new ArrayList <Double>();

       prices.add(1.50);
       prices.add(3.50);
       prices.add(4.50);
       prices.add(3.50);

        adminNotes.displayMenu(menu, prices);
    
    System.out.println("\n NINJA BONUS 4");
    // PLace where a barista can type multiple customers or quit the app after type "Q";

    ArrayList<String> customerListBar = new ArrayList<String>();
    adminNotes.addCustomers (customerListBar);
    }
}

 
      

        
   
      