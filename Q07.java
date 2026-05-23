/* Customer Discount Eligibility Checker
Create a Customer class with name, isMember (boolean), and purchaseAmount. 
If a customer is a member and purchase amount > 1000, apply 15% discount. 
Otherwise, no discount. Display final amount payable. */

class Customer{
    String name;
    boolean isMember;
    double purchaseAmount;

    Customer(String n, boolean i, double p){
        this.name = n;
        this.isMember = i;
        this.purchaseAmount = p;
    }

    public double finalAmount(){
        System.out.println("Name: " + name);
        System.out.println("Membership: " + isMember);
        System.out.println("Amount purchased: " + purchaseAmount);

        if (isMember == true && purchaseAmount > 1000){
            purchaseAmount -= (15.0/100.0) * purchaseAmount;
        }

        System.out.println("Final amount payable: " + purchaseAmount);

        return purchaseAmount;
    }
}


public class Q07 {
    public static void main(String[] args){
        Customer person1 = new Customer("Philips", true, 2000);
        Customer person2 = new Customer("John", false, 2000);
        
        person1.finalAmount();
        person2.finalAmount();
    }
}
