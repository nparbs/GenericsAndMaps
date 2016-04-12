/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author nparbs
 */
public class BikeApp {
    public static void main(String[] args) {
        Bike bike1 = new Bike("b","111");
        Bike bike2 = new Bike("a","222");
        
        if(bike1.equals(bike2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
        Set<Bike> bikes = new TreeSet<Bike>();
        bikes.add(bike1);
        bikes.add(bike2);
        
        
        for(Bike b : bikes){
            System.out.println(b);
        }
        
        List<Bike> bikes2 = new ArrayList<Bike>();
        bikes2.add(bike1);
        bikes2.add(bike2);
        
        Collections.sort(bikes2,new BikeByManu());
        for(Bike b : bikes2){
            System.out.println(b);
        }
        
        
        Bike[] bikes3 = new Bike[2];
        
        bikes3[0] = bike1;
        bikes3[1] = bike2;
        
        Arrays.sort(bikes3);
        
        
        
        
        
        
        
    }
}
