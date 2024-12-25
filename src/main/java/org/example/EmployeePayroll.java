package org.example;

public class EmployeePayroll {
    int id;
    String name;
    float salary;

    public EmployeePayroll(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Id:"+id+" , Name:"+name+" , Salary:"+salary+" ";
    }
}
