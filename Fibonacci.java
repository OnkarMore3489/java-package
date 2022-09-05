package SERIES;
public class Fibonacci
{
    public int iNo;

    public Fibonacci(int iNo)
    {
        this.iNo=iNo;
    }
    public void fibonacci()
    {
        int a=0,b=1,c=0;
        System.out.print(a+" ");
        System.out.print(b+" ");

        for(int i=1;i<=iNo-2;i++)
        {
           c=a+b;
           System.out.print(c+" ");
           a=b;
           b=c;
        }
        System.out.println();
    }
}