import classes.Student;
import exceptions.AgeNotWithinRangeException;
import exceptions.NameNotValidException;

public class q1 {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Ramesh", 19, "CSE");
            s1.display();
            Student s2 = new Student(2, "Ra@mesh1", 19, "CSE");   // invalid name
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        try {
            Student s3 = new Student(3, "Suresh", 25, "ECE");     // invalid age
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}