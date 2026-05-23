/* Subject Grade Calculator with Array and Switch
Create a Subject class with a subjectName and a marks variable. Store 5 subjects in an array. 
For each subject, use switch or if-else to assign grades:

≥ 90 → A
80–89 → B
70–79 → C
Below 70 → D
Display subject name, marks, and grade. */

class Subject{
    String subjectName;
    int marks;
    char grade;

    Subject(String s, int m) {
        this.subjectName = s;
        this.marks = m;
    }
    
    public char getGrade(){
        if (marks >= 90){
            this.grade = 'A';
        } else if (marks >= 80 && marks <= 89){
            this.grade = 'B';
        } else if (marks >= 70 && marks <= 79){
            this.grade = 'C';
        } else if (marks <= 70){
            this.grade = 'D';
        }

        return this.grade;
    }

    public void displayDetails(){
        System.out.println("Subject: " + subjectName);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println("");
    }

}

public class Q08 {
    public static void main(String[] args){
        Subject[] subject = {new Subject("CS", 85), new Subject("English", 60), new Subject("Maths", 75),
        new Subject("Digital Systems", 80), new Subject("Business Communication", 95)};
        
        for (int i = 0; i < subject.length; i++){
            subject[i].getGrade();
        }

        for (int i = 0; i < subject.length; i++){
            subject[i].displayDetails();
        }
    }
}
