package datastructures;

/**
 *
 * @author al
 */
public class TwoDimensionalArray 
{
    int arr[][] = null;

    /**
     * This is the constructor for TwoDimensionalArray object.
     * It should always have 2 arguments passed to the object to work.
    @param rows this will set the number of row for the array.
    @param cols this will set the number of rows for the array.
    @throws Exception
    */
    public TwoDimensionalArray(int rows, int cols) 
    {
        arr = new int[rows][cols];
        try
        {
            for (int i = 0; i < arr.length; i++) 
            {
                for (int j = 0; j < arr[i].length; j++) 
                {
                    arr[i][j] = Integer.MIN_VALUE;
                }
            }
        }
        catch (Exception e)
        {
            e.getStackTrace();
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
                for (int j = 0; j < arr[i].length; j++) 
                {
                    System.out.print(arr[i][j] + "   ");
                }
                System.out.println("");
            }
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
    
    /**
     * This method is used for displaying the value of specific cell in the array.
    @param row gets the row in the array
    @param col gets the column in the array
    @throws ArrayIndexOutOfBoundsException
    */
    public void PrintArrayCell(int row, int col)
    {
        try
        {
            System.out.println(arr[row][col]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.getStackTrace();
        }
    }
    
        /**
     * This method is used for deleting a specific array cell
    @param row gets the row in the array
    @param col gets the column in the array
    @throws ArrayIndexOutOfBoundsException
    */
    public void DeleteArrayCell(int row, int col)
    {
        try
        {
            arr[row][col] = Integer.MIN_VALUE;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.getStackTrace();
        }
    }
    
    /**
     * This method is used for Inserting in data in the array.
    @param row set the row where the value will be inserted
    @param col set the column where the value will be inserted
    @param val set the value of the data to be inserted
    @throws ArrayIndexOutOfBoundsException
    @throws Exception
    */
    public void InsertArray(int row, int col, int val)
    {
        try 
        {
            if (arr[row][col] == Integer.MIN_VALUE)
            {
                arr[row][col] = val;
                System.out.println("Value successfully inserted");
            }
            else
            {
                System.out.println("The array location is already occupied. Please enter different index.");
            }
            
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
                for (int j = 0; j < arr[i].length; j++) 
                {
                    if (arr[i][j] == value)
                    {
                        System.out.println("Item exists");
                        System.out.println(value + " is located at row " + i + " and column " + j);
                        return;
                    }
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
    
    /**
     * This method is used for deleting the array
    */
    public void DeleteArray()
    {
        arr = null;
        System.out.println("The array has been deleted");
    }
}
