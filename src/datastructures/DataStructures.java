package datastructures;

/**
 *
 * @author ALFREDO YAP
 * CS MAJOR - NEW YORK, NY
 * DATA STRUCTURES PRACTICE FOR JAVA
 */
public class DataStructures {
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) 
    {
        // <editor-fold defaultstate="collapsed" desc="old stuffs - Single Dimensional Array">
/* 
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
*/
// </editor-fold>
        
        
        TwoDimensionalArray tda = new TwoDimensionalArray(3, 3);
        
        tda.PrintArray();
        System.out.println("");
        System.out.println("");
        
        tda.InsertArray(0, 0, 10);
        tda.PrintArray();
        
        System.out.println("");
        System.out.println("");
        
        tda.InsertArray(1, 1, 20);
        tda.PrintArray();
        
        System.out.println("");
        System.out.println("");
        
        tda.InsertArray(2, 2, 30);
        tda.PrintArray();
        
        System.out.println("");
        System.out.println("");
        tda.Search(20);
        System.out.println("");
        System.out.println("");
        tda.PrintArrayCell(0,2);
    }
    
}
