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
public class PBO_IF2_10116414_Rabbit {
    public static void main(String[] args) {
        
        Rabbit rabbit = new Rabbit("Peter",false,"grass",4,"grey");
        rabbit.isVegetarian();
        rabbit.getEats();
        rabbit.getNoOfLegs();
        
        System.out.println("Hello, his name is " + rabbit.getName());
        System.out.println(rabbit.getName() + " is Vegetarian? " + rabbit.isVegetarian());
        System.out.println(rabbit.getName() + " eats " + rabbit.getEats());
        System.out.println(rabbit.getName() + " color is " + rabbit.getColor());
    
    }
}
