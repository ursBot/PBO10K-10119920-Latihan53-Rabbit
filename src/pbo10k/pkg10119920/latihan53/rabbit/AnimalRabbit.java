/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan53.rabbit;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class AnimalRabbit {

    public static void main(String[] args) {
        
        Rabbit r = new Rabbit("Peter", false, "grass", 4, "grey");
        
        System.out.println("Hello, His name is " + r.getName());
        System.out.println("Peter is Vegetarian? " + r.isVegetarian());
        System.out.println("Peter eats " + r.getEats());
        System.out.println("Peter has " + r.getNoOfLegs() + " legs.");
        System.out.println("Peter color is " + r.getColor());
    }
}
