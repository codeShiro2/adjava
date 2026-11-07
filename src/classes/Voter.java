package classes;

public class Voter {
    public int voterId;
    public String name;
    public int age;

    public Voter(int voterId, String name, int age) {
        if (age < 18)
            throw new IllegalArgumentException("invalid age for voter");  // unchecked
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }
}
