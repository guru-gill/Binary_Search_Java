
public class Binary {

    public int addNumber(int[] data,int item)
    {

        int start,mid,end;
        start=0;
        end=(data.length-1);
        while (start<=end)
        {
            mid=(start+end)/2;

            if(data[mid]==item)
            {
                return mid;
            }else if (data[mid]<item)
            {
                start=(mid+1);
            }else
            {
                end=(mid-1);
            }

        }
        return 0;

    }

    public static void main(String[] agrs)
    {
        Binary BS= new Binary();
        int[] array={2,4,6,8,10,12,14,16,18,20,21};
        int k=BS.addNumber(array,20);
        if(k==0)
        {
            System.out.println("Data Not Found");
        }else
        {
            System.out.println("Data  Found At Location "+k);
        }


    }
}

