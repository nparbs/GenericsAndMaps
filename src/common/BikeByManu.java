/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Comparator;

/**
 *
 * @author nparbs
 */
public class BikeByManu implements Comparator<Bike> {

    @Override
    public int compare(Bike b1, Bike b2) {
        return b1.getManu().compareTo(b2.getManu());
    }
}