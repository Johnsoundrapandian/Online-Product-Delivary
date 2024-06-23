import java.util.*;

class HasMabSetTableDemo {
    public static void main(String[] args) {

        int[] i = {1, 2, 3, 4, 5, 6, 7};
        int c = 2;
        int mid = 0;
        int start = 0, end = i.length-1;
        while (start < end)
        {
            if (end >= start)
            {
                mid = ( end+start) / 2;
                if (i[mid] == c)
                {
                    System.out.println(mid);
                    break;
                }
                else if (i[mid] < c)
                {
                    start = mid + 1;
                }
                else
                {
                    end = mid - 1;
                }

            }
            mid = (start + end) / 2;
        }
        if (start > end)
        {
            System.out.println("not found");
        }
        //System.out.println(mid);
    }
}