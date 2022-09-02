package SERIES;

public class Squares
{
    public int iNo;

    public Squares(int iNo)
    {
        this.iNo=iNo;
    }
    public void squares()
    {
        for(int i=1;i<=iNo;i++)
        {
            System.out.print(i*i+" ");
        }
    }
}