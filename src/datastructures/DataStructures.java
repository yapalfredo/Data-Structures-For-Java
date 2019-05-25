/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

/**
 *
 * @author al
 */
public class DataStructures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SingleDimensionalArray sda = new SingleDimensionalArray(10);
        sda.PrintArray();
        
        System.out.println("");
        System.out.println("");
        
        sda.Insert(0, 10);
        sda.Insert(1, 200);
        sda.Insert(2, 300);
        sda.Insert(3, 400);
        sda.Insert(3, 5000);
        
        System.out.println("");
        
        sda.PrintArray();
        
        System.out.println("");
        System.out.println("");
        
        sda.Search(300); System.out.println("");
        sda.PrintArrayCell(3);
        
        
    }
    
}
