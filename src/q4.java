import java.util.HashMap;

public class q4 {
    static HashMap<String, Integer> students = new HashMap<>();

    static void addStudent(String name, int grade) {
        students.put(name, grade);
        System.out.println(name + " added.");
    }

    static void removeStudent(String name) {
        if (students.remove(name) != null)
            System.out.println(name + " removed.");
        else
            System.out.println(name + " not found.");
    }

    static void displayGrade(String name) {
        if (students.containsKey(name))
            System.out.println(name + "'s grade: " + students.get(name));
        else
            System.out.println(name + " not found.");
    }

    public static void main(String[] args) {
        addStudent("Asha", 85);
        addStudent("Kumar", 78);
        displayGrade("Asha");
        removeStudent("Kumar");
        displayGrade("Kumar");
    }
}
