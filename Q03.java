/* Student Average Using Arrays and Class
Create a Student class with name and an array of 3 subject marks. 
Write a method to calculate the average and another to determine pass/fail status (average >= 40). 
Display the name, marks, average, and result. */

class Student{
    String name = "Sanjeev Paija";
    int[] marks = {55, 75, 90};
    double average;
    char result;
    
    public double average(){
        double total = 0.0;
        for (int i = 0; i < 3; i++){
            total += marks[i];
        }

        this.average = total / 3.0;

        return this.average;
    }

    public char result(){
        if (this.average >= 40){
            this.result = 'P';
        } else {
            this.result = 'F';
        }
        return this.result;
    }

    public void displayResult(){
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks[0] + " " + marks[1] + " " + marks[2]);
        System.out.println("Average: " + average);
        System.out.println("Result: " + result);
    }
}

public class Q03{
    public static void main(String[] args){
        Student student = new Student();

        student.average();
        student.result();
        student.displayResult();
    }
}