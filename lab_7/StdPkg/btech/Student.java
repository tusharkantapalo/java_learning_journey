package lab_7.StdPkg.btech;

public class Student {
    String name, branch;
    int roll;

    public Student(String name, String branch, int roll) {
        this.name = name;
        this.branch = branch;
        this.roll = roll;
    }

    public void display() {
        System.out.println("Name: " + name + "\nBranch: " + branch + "\nRoll No.: " + roll);
    }
}
