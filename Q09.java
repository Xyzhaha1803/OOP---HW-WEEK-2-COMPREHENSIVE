/* Laptop Specification Viewer
Create a Laptop class with brand, ramSize, and storage. 
Create 3 objects and display their specs only if the RAM is 8 GB or more. */

class Laptop{
    String brand;
    int ramSize;
    int storage;

    Laptop(String b, int r, int s){
        this.brand = b;
        this.ramSize = r;
        this.storage = s;
    }

    public void displaySpecs(){
        if (ramSize >= 8){
            System.out.println("Brand: " + brand);
            System.out.println("Ram Size: " + ramSize + "GB");
            System.out.println("Storage: " + storage + "GB");
        } else {
            System.out.println("No specs for you.");
        }
    }
}

public class Q09 {
    public static void main(String[] args){
        Laptop lenovo = new Laptop("Lenovo", 16, 648);
        Laptop HP = new Laptop("HP", 4, 128);

        lenovo.displaySpecs();
        HP.displaySpecs();
    }
}
