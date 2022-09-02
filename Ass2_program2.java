/*
 Write a program to create a package named Series having different classes to print series:
 1.Prime numbers.
 2.Fibonacci Series.
 3.Squares of numbers.
 */
import SERIES.Prime;
import SERIES.Fibonacci;
import SERIES.Squares;

class Ass2_program2 
{
    public static void main(String args[])
    {
        Prime pobj = new Prime(10);
        pobj.prime();

        Fibonacci fobj = new Fibonacci(7);
        fobj.fibonacci();

        Squares sobj = new Squares(5);
        sobj.squares();
    }    
}
// class Prime
// {
//     int iNo;

//     public Prime(int iNo)
//     {
//         this.iNo=iNo;
//     }

//     public void prime()
//     {
//         for(int i=2;i<=iNo;i++)
//         {
//             boolean bResult=true;

//             for(int j=2;j<=i/2;j++)
//             {
//                 if(i%j==0)
//                 {
//                     bResult=false;
//                     break;
//                 }
//             }
//             if(bResult==true)
//             {
//                 System.out.print(i+" ");
//             }
//         }
//         System.out.println();
//     }
// }
// class Fibonacci
// {
//     public int iNo;

//     public Fibonacci(int iNo)
//     {
//         this.iNo=iNo;
//     }
//     public void fibonacci()
//     {
//         int a=0,b=1,c=0;
//         System.out.print(a+" ");
//         System.out.print(b+" ");

//         for(int i=1;i<=iNo-2;i++)
//         {
//            c=a+b;
//            System.out.print(c+" ");
//            a=b;
//            b=c;
//         }
//         System.out.println();
//     }
// }
// class Squares
// {
//     public int iNo;

//     public Squares(int iNo)
//     {
//         this.iNo=iNo;
//     }
//     public void squares()
//     {
//         for(int i=1;i<=iNo;i++)
//         {
//             System.out.print(i*i+" ");
//         }
//     }
// }