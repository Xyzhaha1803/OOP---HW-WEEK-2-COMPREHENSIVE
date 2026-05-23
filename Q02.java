/* Mobile Phone Details Using Class and Access Specifiers
Create a class MobilePhone with brand, model, and price. 
Keep price as a private variable and provide getPrice() and setPrice() methods to access and update it. 
Display phone details using a method. */

class MobilePhone{
    String brand = "Apple";
    String model = "Iphone 12";
    private double price;

    public void setPrice(double p){
        price = p;
    }

    public double getPrice(){
        return price;
    }

    public void displayDetails(){
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

public class Q02{
    public static void main(String[] args){
        MobilePhone apple = new MobilePhone();

        apple.setPrice(999.99);
        apple.displayDetails();
    }
}