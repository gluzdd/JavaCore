package hw3;

import java.time.LocalDate;

public class Worker extends Employee{

    protected String post;

    protected String task;
    protected int maxLevel;

    public void setTask(String task) {
        this.task = task;
    }

    public Worker(String firstname, String lastname, String phoneNumber, int salary, LocalDate birthdate, String post, int maxLevel) {
        super(firstname, lastname, phoneNumber, salary, birthdate, maxLevel);
        this.post = post;
        this.maxLevel = maxLevel;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "post='" + post + '\'' +
                ", task='" + task + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", birthdate=" + birthdate +
                ", maxLevel=" + maxLevel +
                '}';
    }
}
