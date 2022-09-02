package SERIES;
public class Prime
{
    int iNo;

    public Prime(int iNo)
    {
        this.iNo=iNo;
    }

    public void prime()
    {
        for(int i=2;i<=iNo;i++)
        {
            boolean bResult=true;

            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    bResult=false;
                    break;
                }
            }
            if(bResult==true)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}