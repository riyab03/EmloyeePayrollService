package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {

    ArrayList<EmployeePayroll>arr=new ArrayList<>();

    public static void main(String[] args) {
        EmployeePayrollService s1=new EmployeePayrollService();
        s1.getInfo();
        s1.writeInfo();
    }

    private void getInfo() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details of Employee in ID,NAME,SALARY FORMAT:");
        int id=sc.nextInt();
        String s=sc.next();
        float d=sc.nextFloat();
        arr.add(new EmployeePayroll(id,s,d));
        System.out.println("Employee info added successfully");
    }

    private void writeInfo() {
        System.out.println("Details of Employee in ID,NAME,SALARY FORMAT:");
        for(EmployeePayroll a:arr) {
            System.out.println(a);
        }
    }


}

