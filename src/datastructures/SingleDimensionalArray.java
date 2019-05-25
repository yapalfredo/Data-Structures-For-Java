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
public class SingleDimensionalArray {
    
    int arr[] = null;

    //Constructor
    public SingleDimensionalArray(int arraySize) 
    {
        arr = new int[arraySize];
           
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }
    
    //Displays Array
    public void PrintArray()
    {
        try
        {
            for (int i = 0; i < arr.length; i++) 
            {
                System.out.print(arr[i] + " ");   
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.getStackTrace();
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
    
    public void PrintArrayCell(int index)
    {
        try
        {
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.getStackTrace();
        }
    }
    
    //Inserts value in the array
    public void Insert(int index, int value)
    {
        try
        {
           if (arr[index] == Integer.MIN_VALUE)
           {
               arr[index] = value;
               System.out.println(value + " was successfully inserted at index " + index);
           }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            e.getStackTrace();
        }
        catch(Exception e)
        {
            e.getStackTrace();
        }
    }
    
    //Search for item if exists
    public void Search(int value)
    {
        try
        {
            for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i] == value)
                {
                    System.out.println("Item exists");
                    System.out.println(value + " has an index of " + i);
                    return;
                }
            }
            System.out.println(value + " not found!");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.getStackTrace();
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
}
