package MATRIX;
import java.util.*;
public class Matrix
{
    public int Arr[][];
    public int Brr[][];

    public Matrix(int iRow,int iCol)
    {
       Arr=new int[iRow][iCol];
       Brr=new int[iRow][iCol];
    }
    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Element in 1st Matrix : ");
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }
        
        System.out.println("Enter the Element in 2nd Matrix : ");
        for(int i=0;i<Brr.length;i++)
        {
            for(int j=0;j<Brr[i].length;j++)
            {
                Brr[i][j]=sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("Enterd  Element 1st Matrix are : ");
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Enterd  Element 2nd Matrix are : ");
        for(int i=0;i<Brr.length;i++)
        {
            for(int j=0;j<Brr[i].length;j++)
            {
                System.out.print(Brr[i][j]+" ");
            }
            System.out.println();
        }
    }

     public void Addition()
     {
         System.out.println("Addition of correspondance Elements is : ");
         for(int i=0;i<Arr.length;i++)
         {
             for(int j=0;j<Arr[i].length;j++)
             {
                 int add=Arr[i][j] + Brr[i][j];
                 System.out.print(add+" ");
             }
             System.out.println();
         }
     }

     public void Maximum()
    {
        int iMax1=Arr[0][0],iMax2=Brr[0][0];
        
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            {
                if(iMax1 < Arr[i][j])
                {
                    iMax1=Arr[i][j];
                }
                if(iMax2 < Brr[i][j])
                {
                    iMax2=Brr[i][j];
                }
            }
        }
        System.out.println("Maximum Number in 1st Matrix is : "+iMax1);
        System.out.println("Maximum Number in 2nd Matrix is : "+iMax2);
    }
}