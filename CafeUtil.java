import java.util.ArrayList;

public class CafeUtil {

    // Method to calculate the customer reward 
    
    public int calculateReward(int numWeeks) {
 
        int sum = 0;
        for (int i = 1; i < (numWeeks + 1); i++){
            sum = sum +i;
        }
            return sum;
    }

    // Method to calculate total purchase 

    public double getOrderTotal (double [] prices){
    
        double totalOrder = 0;
        for (int i = 0; i < prices.length; i++){
            totalOrder = totalOrder + prices[i];        
        }
            return totalOrder;
    }

    // Method to display the menu items with respective index in the array

    public void displayMenu(ArrayList<String> menuItems) {

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s %s \n", i, menuItems.get(i));
        }
    }

    // Method to add all the usernames in an arrayList

    public void addCustomer(ArrayList<String> customerList) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s! ", userName);
        System.out.printf("There are %s people ahead of you.\n", customerList.size());
        customerList.add(userName);
        System.out.println(customerList);
    }

    public void printPriceChart(String product, double price, int maxQuantity){
        System.out.println (product);
            int count = maxQuantity;
            while (count<4) {
                double totalPrice = count * price;
                System.out.printf("%d - $%.2f %n", count, totalPrice);
            count++;
        }
    }

    public void discountFromTwo(double price, double discount, int maxQuantity){
            double totalPrice = price;
        for (int num = 1; num <= maxQuantity; num++){
            if (num == 1){
                totalPrice = price;
            }
            else {
                totalPrice = ((price * num) - ((num-1) * discount));
            }
            System.out.printf("%d - $%.2f %n", num, totalPrice);
        }
    }

    public boolean displayMenu(ArrayList<String> menu, ArrayList<Double> prices){

        if (menu.size() == prices.size()){
           for (int num = 0; num < menu.size(); num++){
            System.out.printf("%d %s -- $%.2f %n", num, menu.get(num), prices.get(num));
            }
            return true;
        }
        else {
            return false;
        }
    }  


    public void addCustomers(ArrayList<String> customerListBar) {
        boolean finish = false;
        String boxName;
        
        while (!finish) {
        
        System.out.println("Type a customer name or type Q to quit the app:");
        boxName = System.console().readLine();
        
        if (boxName.equals("Q")) {
            finish = true;
            return;
        }
        customerListBar.add(boxName);
        System.out.println(customerListBar);
        }
    }
}
