/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cpg.controller;

import com.leapfrog.cps.DAO.StudentDAO;
import com.leapfrog.cps.util.Student;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author AM3ET
 */
public class Controller {

    private StudentDAO stdDAO;

    public Controller(StudentDAO stdDAO) {
        this.stdDAO = stdDAO;
    }

    public void save() {

        try {
            FileWriter writer = new FileWriter("student_details.csv");
            StringBuilder builder = new StringBuilder();
            stdDAO.getAll().forEach(s -> {
                builder.append(s.getId()).append(",").append(s.getfName()).append(",").append(s.getlName()).append(",").append(s.getEmail()).append(",").append(s.getContact()).append(",").append(s.isStatus()).append("\r\n");
            });
            writer.write(builder.toString());
            writer.close();
        } catch (IOException ioe) {
        }
    }
    public void show(){
        Student std = new Student();
        try{
            BufferedReader reader = new BufferedReader(new FileReader("student_details.csv"));
            String line="";
            //StringBuilder builder = new StringBuilder();
            while((line=reader.readLine())!=null){
                String[] tokens=line.split(",");
                std.setId(Integer.parseInt(tokens[0]));
                std.setfName(tokens[1]);
                std.setlName(tokens[2]);
                std.setEmail(tokens[3]);
                std.setContact(tokens[4]);
                std.setStatus(Boolean.getBoolean(tokens[5]));
                stdDAO.insert(std);
                
            }
            stdDAO.getAll().forEach(s -> {
                System.out.println(s.getId()+s.getfName());
            });
            reader.close();
            
            
        }catch(IOException ie){
            
        }
    }
}
