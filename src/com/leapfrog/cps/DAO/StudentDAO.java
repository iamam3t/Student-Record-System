/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.cps.DAO;

import com.leapfrog.cps.util.Student;
import java.util.List;

/**
 *
 * @author AM3ET
 */
public interface StudentDAO {
     boolean insert(Student student);
     List<Student> getAll();
     
}
