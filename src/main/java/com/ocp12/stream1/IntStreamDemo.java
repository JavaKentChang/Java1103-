
package com.ocp12.stream1;

import java.util.stream.IntStream;
import java.util.stream.Stream;


public class IntStreamDemo {
    public static void main(String[] args) {
        int[] nums = {100,50,70,30};
        //use Java 8 印出及格分數的總和=170
        //before Java 8
        int sum=0;
        for (int x : nums) {
            if(x>=60){
                sum +=x;}
        }
        System.out.println(sum);
        //====================
        
        //Java 8 僅兩行
        int sum2 = IntStream.of(nums).filter(x->x>=60).sum();
        System.out.println(sum2);           
    }
    
}
