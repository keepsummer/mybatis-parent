package com.lizhimin.mybatis.test;

/**
 * 抽取
 */
public class test2 {
    public static void main(String [] args){

        getData();
        getInformation();
        getResult();
        //选取多行，option+shift

    }

    /**
     * 提取方法option+command+M
     */
    private static void getResult() {
        System.out.println("123");
        System.out.println("123");
        System.out.println("123");
    }

    private static void getInformation() {
        getResult();
    }

    private static void getData() {
        System.out.println("123");
        System.out.println("123");
    }


}
