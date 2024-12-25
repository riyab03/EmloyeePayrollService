package org.example;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayrollService {

    ArrayList<EmployeePayroll>arr=new ArrayList<>();
    private static final String fname="C://Users//riyab//IdeaProjects//EmployeePayrollService//src//main//java//org//example//ep";


    public static void main(String[] args) throws IOException {
        EmployeePayrollService s1=new EmployeePayrollService();
        s1.getInfo();
        s1.writeInfo();

        s1.fileop();
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

    private void fileop() throws IOException {
        File file= new File(fname);
        if(file.exists()){
            System.out.println("File Exists");
            file.delete();
            System.out.println("File deleted");
        }
        else{
            System.out.println("File doesn't exists");
        }


        File directory=new File("direc");
        if(directory.mkdir()){
            System.out.println("Directory created");
        }


        if(file.createNewFile()){
            System.out.println("empty file created");
        }


        File f1=new File(".");
        String[] files=f1.list();
        for(String f:files){
            System.out.println(f);
        }




    }

}

