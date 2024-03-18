package hw3;

import java.time.LocalDate;
import java.util.Objects;

public class Manager extends Employee{

    public String post = "Manager";

    public String task;
    public int maxLevel;

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Manager(String firstname, String lastname, String phoneNumber, int salary, LocalDate birthdate, String post, int maxLevel) {
        super(firstname, lastname, phoneNumber, salary, birthdate, maxLevel);
        this.post = post;
        this.maxLevel = maxLevel;
    }

    public static void addSalary(Employee[] employees, int age, int addAmount) {
        for (Employee employee : employees) {
            if (employee instanceof Worker) {
                employee.setSalary(employee.getSalary() + addAmount);
            }
        }
        System.out.println("Зарплата повышена сотрудникам");
    }

    public static void assign(Employee[] employees, String lastname, String task, int level){
        boolean flag = false;
        for (Employee employee : employees) {
             if (employee instanceof Worker) {
                 if(level <= ((Worker) employee).maxLevel) {
                     if (Objects.equals(employee.getLastname(), lastname)) {
                         ((Worker) employee).setTask(task);
                         flag = true;
                     }
                 }
             }
        } if (!flag){
            for (Employee employee : employees){
                if (employee instanceof Manager){
                    ((Manager) employee).setTask(task);
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "post='" + post + '\'' +
                ", task='" + task + '\'' +
                ", maxLevel=" + maxLevel +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", birthdate=" + birthdate +
                '}';
    }
}
