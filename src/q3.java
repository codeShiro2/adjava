import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day position (0-6): ");
        try {
            int idx = sc.nextInt();
            System.out.println("Day: " + days[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index! Please enter a number between 0 and 6.");
        }
        sc.close();
    }
}
