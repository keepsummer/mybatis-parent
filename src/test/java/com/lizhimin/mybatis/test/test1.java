package com.lizhimin.mybatis.test;

import com.lizhimin.mybatis.Happy;

import java.util.ArrayList;
import java.util.List;

public class test1 {
    public static void main(String [] args){

        Happy happy = new Happy();
        //Happy.nn 快速出现对象不为空的判断

        if (happy != null && happy.getBig()!= null) {
            happy.setBig("一百");
            System.out.println(happy);
        }else{
            System.out.println("happy 对象为空");
        }

        List<Happy> list = new ArrayList<>();
        list.add(happy);
         // happy.for 快速出现for循环♻️

        for (Happy happy1 : list) {
            System.out.println(happy1);
        }

    }
}
