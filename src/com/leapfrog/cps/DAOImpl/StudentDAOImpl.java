/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cps.DAOImpl;

import com.leapfrog.cps.DAO.StudentDAO;
import com.leapfrog.cps.util.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AM3ET
 */
public class StudentDAOImpl implements StudentDAO {

    List<Student> stdList = new ArrayList<>();

    @Override
    public boolean insert(Student student) {
        return stdList.add(student);
    }

    @Override
    public List<Student> getAll() {
        return stdList;
    }
    
}
