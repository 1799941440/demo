package com.example.demo.queryparam;

/**
 * @author wz
 * @version 1.0
 * @date 2019/3/23 19:18
 * @description
 **/

public class Test{
    public static void main(String[] args) {
        String s = "0,1";
        String[] split = s.split(",");
        for (String c: split) {
            System.out.println(c);
        }
        System.out.println(split.length);
    }
}
