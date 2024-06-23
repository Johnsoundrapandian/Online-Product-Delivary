package com.DSA;
import java.util.*;

 class Rough {
         public double findMedianSortedArrays(int[] nums1, int[] nums2) {
             int[] nums3 = new int[nums1.length + nums2.length];
             int i = 0, k = 0, j = 0;
             while (i < nums1.length) nums3[k++] = nums1[i++];
             while (j < nums2.length) nums3[k++] = nums2[j++];
             Arrays.sort(nums3);
             for(int l : nums3){
                 System.out.print(l+"  ");
             }
             double median =0;
             if (nums3.length % 2 != 0){
                median =  nums3[((nums3.length+1)/2)-1];
             }
             else{
                median = nums3[(nums3.length/2)-1] + nums3[nums3.length/2] ;
                median = median/2;
             }
             return median;
         }
     }
public class MedianOfTwoSortedArray{
    public static void main(String[] args) {
        Rough solution = new Rough();
        int[] n1 = new int[]{1,3};
        int[] n2 = new int[]{2,4};
        double n = solution.findMedianSortedArrays(n1,n2);

        System.out.println(n);
    }
}