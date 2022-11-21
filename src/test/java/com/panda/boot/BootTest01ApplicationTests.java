package com.panda.boot;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BootTest01ApplicationTests {

    @Test
    void contextLoads() {
    }

    //@ParameterizedTest
    //@MethodSource("params")
   /* public void run111(){
        int[] nums = {1,2,3,4,5};
        int[] ints = run11(nums);
        assertArrayEquals(nums,ints);
    }

    public int[] run11(int[] nums){
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a += nums[i];
            nums[i] = a;
        }
        for (int num : nums) {
            System.out.println(num);
        }
        return nums;
    }

    public static int[] params(){
        return new int[]{1,2,3,4,5};
    }*/
}
