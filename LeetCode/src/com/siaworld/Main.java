package com.siaworld;

public class Main {

    public static void main(String[] args) {
        // write your code here


    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1, len2;
        len1 = nums1.length;
        len2 = nums2.length;
        int posA, posB;
        posA=posB=0;
        double result =0.0;

        //int[] whole = new int[len1 + len2];

        int cur = 0;
        int mid = (len1 + len2 ) / 2;
        int peek =0 ;
        while(cur<mid ){
            int tempA = nums1[posA];
            int tempB = nums2[posB];

            if(tempA < tempB) {
                peek = tempA;
                posA++;
            }
            else {
                peek = tempB;
                posB++;

            }
            cur++;

        }

        int next = 0;

        if(posA < len1 && posB < len2){
            next = Math.min(nums1[posA], nums2[posB]);
        }else if (posA == len1){
            next = nums2[posB];
        }else
            next = nums1[posA];

        if( (len1+len2) %2 == 0)
        {
            result = (peek + next)/2.0;

        }else
        {
            result = (double)next;
        }


        return result;

    }
}