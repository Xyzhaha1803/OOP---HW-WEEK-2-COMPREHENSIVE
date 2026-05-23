/* Simple Interest Calculator Using Encapsulation
Create a class SimpleInterest with principal, rate, and time as private variables. 
Use a constructor to initialize them and a method calculateInterest() to return simple interest. 
Display the result. */

class SimpleInterest{
    private double principal;
    private double rate;
    private double time;
    private double interest;

    SimpleInterest(double p, double r, double t){
        this.principal = p;
        this.rate = r;
        this.time = t;
    }

    public double calculateInterest(){
        this.interest = principal * rate * time;

        return this.interest;
    }

    public void displayResult(){
        System.out.println("The total interest is: $" + interest);
    }
}

public class Q10 {
    public static void main(String[] args){
        SimpleInterest interest1 = new SimpleInterest(1000, 0.02, 3);

        interest1.calculateInterest();
        interest1.displayResult();
    }
}
