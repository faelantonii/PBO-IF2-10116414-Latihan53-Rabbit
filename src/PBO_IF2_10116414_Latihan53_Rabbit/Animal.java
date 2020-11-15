/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan53_Rabbit;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan rabbit
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal() {
        
    }
    
    public boolean isVegetarian() {
        if(vegetarian) {
            return true;
        } else {
            return false;
        }
    }
    
    public String getEats() {
        return eats;
    }
    
    public int getNoOfLegs() {
        return noOfLegs;
    }
}
