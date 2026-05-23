/*Tax Calculator Based on Income Slabs
Create a class TaxPayer with name and income. Write a method to calculate tax using if-else:

Income < 2,50,000 → No Tax
2,50,000 to 5,00,000 → 10%
5,00,000 to 10,00,000 → 20%
Above 10,00,000 → 30%
Display the name and tax payable. */

class TaxPayer{
    String name;
    double income;
    double tax;

    TaxPayer(String n, double i){
        this.name = n;
        this.income = i;
    }

    public double calculateTax(){
        if (this.income < 250000){
            this.tax = 0;
        } else if(this.income >= 250000 && this.income < 500000){
            this.tax = (10.0/100.0) * this.income;
        } else if(this.income >= 500000 && this.income < 1000000){
            this.tax = (20.0/100.0) * this.income;
        } else if(this.income >= 1000000){
            this.tax = (30.0/100.0) * this.income;
        }

        return this.tax;
    }

    public void displayDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Tax to be paid: " + this.tax);
    }
}

public class Q05 {
    public static void main(String[] args){
        TaxPayer payer1 = new TaxPayer("Ron", 300000);
        TaxPayer payer2 = new TaxPayer("Jason", 2000000);

        payer1.calculateTax();
        payer2.calculateTax();

        payer1.displayDetails();
        payer2.displayDetails();
    }
}
