import classes.Voter;

public class q2 {
    public static void main(String[] args) {
        try {
            Voter v1 = new Voter(101, "Anu", 25);
            System.out.println("Voter created: " + v1.name);
            Voter v2 = new Voter(102, "Ravi", 16);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
