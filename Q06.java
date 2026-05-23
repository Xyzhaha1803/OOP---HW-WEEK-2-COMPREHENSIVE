/* College Admission Eligibility (Switch Version)
Create a Student class with stream (e.g., "Science", "Commerce", "Arts"). 
Using switch, display eligible courses for each stream. */

class Student{
    String name;
    String stream;

    Student(String n, String s){
        this.name = n;
        this.stream = s;
    }

    public void courses(){
        System.out.println("Student: " + name);
        switch(stream){
            case "Science" -> System.out.println("Eligible courses: BCSIT, BSC & MBBS");
            case "Arts" -> System.out.println("Eligible courses: BA & BFA");
        }
    }
}

public class Q06 {
    public static void main(String[] args){
        Student student1 = new Student("Sahil", "Science");
        Student student2 = new Student("Suyog", "Arts");

        student1.courses();
        student2.courses();
    }
}
