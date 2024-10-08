package com.icode.questions;

import java.util.Arrays;

public class FindMissingNumberInArrayEx {
    public static void main(String[] args) {

        int[] a = {3,7,5,1,2,4,9,11};

        Arrays.sort(a);

        for( int i = 1; i < a.length; i++){
            if( a[i] - a[i -1] == 1){

            } else {
                System.out.println(" missing number: "+ (a[i] - 1));
            }
        }
    }
}
