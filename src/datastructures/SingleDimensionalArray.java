package datastructures;

/**
 *
 * @author al
 */
public class SingleDimensionalArray {
    
    int arr[] = null;

    /**
     * This is the constructor for this SingleDimensionalArray object.
     * It should always have a parameter passed to the object to work.
    @param arraySize this will set the capacity of your array.
    @throws Exception
    */
    public SingleDimensionalArray(int arraySize) 
    {
        try
        {
            arr = new int[arraySize];
            for (int i = 0; i < arr.length; i++) 
            {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    /**
     * This method is used for Traversing through the array
     * and displays the value in each cell.
    @throws ArrayIndexOutOfBoundsException
    @throws Exception
    */
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
    
    /**
     * This method is used for displaying the value of specific cell in the array.
    @param index the location in the array that you want the value to be displayed.
    @throws ArrayIndexOutOfBoundsException
    */
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
    
    /**
     * This method is used for deleting a specific array cell
    @param index the location in the array you want to delete.
    @throws ArrayIndexOutOfBoundsException
    */
    public void DeleteArrayCell(int index)
    {
        try
        {
            arr[index] = Integer.MIN_VALUE;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.getStackTrace();
        }
    }
    /**
     * This method is used for Inserting in data in the array.
    @param index the location in the array you want to insert the data at.
    @param value the data that will be inserted in the array.
    @throws ArrayIndexOutOfBoundsException
    @throws Exception
    */
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
    
    
    
    /**
     * This method is used for searching a value in the array.
    @param value the data that will be searched in the array.
    @throws ArrayIndexOutOfBoundsException
    @throws Exception
    */
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
