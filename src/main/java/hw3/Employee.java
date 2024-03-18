package hw3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Employee implements Comparable<Employee>{

    protected String firstname;
    protected String lastname;
    protected String phoneNumber;
    protected int salary;
    protected LocalDate birthdate;
    protected int maxLevel;

    public Employee(String firstname, String lastname, String phoneNumber, int salary, LocalDate birthdate, int maxLevel) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        setBirthdate(birthdate);
        this.maxLevel = maxLevel;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return this.birthdate == null ? -1 : (int) this.birthdate.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    public void setBirthdate(LocalDate birthdate) {
        if (birthdate == null || birthdate.isAfter(LocalDate.now().minusYears(14))){
            System.out.println("Дата рождения не корректна!");
        } else {
            this.birthdate = birthdate;
        }
    }

    @Override
    public int compareTo(Employee o) {
        return lastname.compareTo(o.lastname);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + this.getAge() +
                '}';
    }

//    public static void addSalary(Employee[] employees, int age, int addAmount) {
//        for (Employee employee : employees) {
//            if (employee.getAge() >= age) {
//                employee.setSalary(employee.getSalary() + addAmount);
//            }
//        }
//        System.out.println("Зарплата повышена сотрудникам 45+");
//    }

}
