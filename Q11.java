/* Airline Ticket Pricing System
Create a class Ticket with passengerName, travelClass (Economy, Business, First), and basePrice. 
Use if-else or switch to increase price by:

Economy → No change
Business → +30%
First → +50%
Display final price. */

class Ticket{
    String passengerName;
    String travelClass;
    double basePrice;
    double finalPrice;

    Ticket(String p, String t, double b){
        this.passengerName = p;
        this.travelClass = t;
        this.basePrice = b;
    }

    public double priceIncrease(){
        if (travelClass.equals("Economy")){
            this.finalPrice = this.basePrice + 0.0;
        } else if(travelClass.equals("Business")){
            this.finalPrice = this.basePrice + ((30.0/100.0) * this.basePrice);
        } else if(travelClass.equals("First")){
            this.finalPrice = this.basePrice + ((50.0/100.0) * this.basePrice);
        }

        return this.finalPrice;
    }

    public void displayDetails(){
        System.out.println("Name: " + passengerName);
        System.out.println("Travel Class: " + travelClass);
        System.out.println("Price: " + finalPrice);
    }
}

public class Q11 {
    public static void main(String[] args){
        Ticket ticket1 = new Ticket("John", "First", 300.0);
        Ticket ticket2 = new Ticket("Ron", "Economy", 200.0);

        ticket1.priceIncrease();
        ticket2.priceIncrease();

        ticket1.displayDetails();
        ticket2.displayDetails();
    }
}
