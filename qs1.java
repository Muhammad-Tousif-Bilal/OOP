/* reate a Student class with: 
o name, rollNo, marks 
o function to calculate grade */
class Student {
        String name;
        int rollNo;
        int marks;

        public char calculate_Grade() {
            if (marks >= 90) {
                return 'A';
            } else if (marks >= 80 ) {
                return 'B';
            } else if (marks >= 70 ) {
                return 'C';
            } else if (marks >= 60) {
                return 'D';
            } else if (marks >= 50 ) {
                return 'E';
            } else {
                return 'F';
            }
        }

    }

public class qs1 {

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "Ali";
        std1.rollNo = 44;
        std1.marks = 79;
        char grade = std1.calculate_Grade();
        System.out.println("Grade is " + grade);
    }
}
