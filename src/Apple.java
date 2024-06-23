class Method{

       protected int[] sort(Sort s,int[] num){
        int[] so_rt =s.acending(num);
        return so_rt;
    }
    public int search(Find f,int[] num,int val){
        int index = f.searching(num,val);
        return index;
    }
}
class Sort {
    public int[] acending(int[] num){
        return num;
    }

}
class Find{
    public int searching(int[] num,int val){
        return val;
    }
}
class SelectionSort extends Sort{
    public int[] acending(int[] num){
        for(int i =0; i < num.length;i++){
            for(int j =i+1; j<num.length;j++){
                if(num[i]>num[j]){
                    int temp = num[i];
                    num[i] =num[j];
                    num[j] = temp;
                }
            }
        }
        return num;
    }

}
class LinearSearch extends Find{
    public int searching(int[] num,int val){
        for(int i= 0; i < num.length;i++){
            if(num[i]==val){
                return i;
            }
        }
        return 0;
    }
}
class BubbleSort extends Sort{
    public int[] acending(int[] num){
        for(int i = num.length-1;i >= 0;i--){
            for(int j = i-1;j>=0;j--){
                if(num[i]<num[j]){
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }
        return num;
    }

}
class BinarySearch extends Find{
    public int searching(int[] num,int val){
        int i =0, j =num.length-1;
        while(i<j){
            int mid = (i+j)/2;
            if(num[mid]<val){
                i = mid+1;

            }
            else if(num[mid]==val){
                return mid;
            }
            else {
                j = mid-1;
            }
        }
        return 0;
    }
}
class InsertionSort extends Sort{
    public int[] acending(int[] num){
        for(int i = num.length-1;i>=0;i--){
            for(int j = i;j>=0;j--){
                if(num[i]<num[j]){
                    int temp =num[i];
                    num[i] = num[j];
                    num[j] =temp;
                }
            }
        }
        return num;
    }
}
public class Apple {
    public static void main(String args[]){
        int[] a ={4,6,1,9,3,8,5,0,7};
        int[] b = new int[a.length];
        int val = 5;
        Sort sort = new InsertionSort();
        Method mathod = new Method();
        b =mathod.sort(sort,a);
        System.out.println("After sorted Array :");
        for(int i= 0; i < b.length;i++){
            System.out.print(b[i]+"  ");
        }
        Find search = new BinarySearch();
        System.out.println("  ");
        int index = mathod.search(search,b,val);
        System.out.print("'"+val+"' value index is :");
        System.out.println(index);


    }
}
