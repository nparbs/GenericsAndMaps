/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author nparbs
 */
public class Bike implements Comparable {
    private String manu;
    private String serNum;

    @Override
    public String toString() {
        return "Bike{" + "manu=" + manu + ", serNum=" + serNum + '}';
    }

    public Bike(String manu, String serNum) {
        this.manu = manu;
        this.serNum = serNum;
    }

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public String getSerNum() {
        return serNum;
    }

    public void setSerNum(String serNum) {
        this.serNum = serNum;
    }
    
    
    
    public int compareTo(Object other) {
        
        Bike o = (Bike)other;
        
        return new CompareToBuilder()
               .append(this.serNum, o.serNum)
               .toComparison();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.serNum);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bike other = (Bike) obj;
        if (!Objects.equals(this.serNum, other.serNum)) {
            return false;
        }
        return true;
    }
    
    
}
