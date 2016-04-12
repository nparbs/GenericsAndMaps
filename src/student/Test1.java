/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import common.Employee;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author nparbs
 */
public class Test1 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Smith","Bob","111-11-1111");
        Employee e2 = new Employee(2,"Grado","Pete","222-11-1111");
        Employee e3 = new Employee(3,"Tee","Timmy","333-11-1111");
        
        
        
        Map<String,Employee> employees = new HashMap<>();
       
        employees.put("1", e1);
        employees.put("2", e2);
        employees.put("3", e3);
        
        Employee employee = employees.get("1"); 
        System.out.println(employee.getSsn());
        
        employees.put("1", e3);
        
        employee = employees.get("1");
        System.out.println(employee.getSsn());
        
    }
    
}
