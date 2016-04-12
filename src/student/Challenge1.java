/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import common.Employee;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author nparbs
 */
public class Challenge1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Smith","Bob","111-11-1111");
        Employee e2 = new Employee(2,"Grado","Pete","222-11-1111");
        Employee e3 = new Employee(3,"Tee","Timmy","333-11-1111");
        
        Map<String,Employee> employees = new HashMap<>();
        
        employees.put("111", e1);
        employees.put("222", e2);
        employees.put("333", e3);
        
        Collection<Employee> vals = employees.values();
        for(Employee e: vals){
            System.out.println(e);
        }
        
        Set<String> keys = employees.keySet();
        for(String key : keys){
            Employee e = employees.get(key);
            System.out.println(e);
        }
        
    }
    
}
