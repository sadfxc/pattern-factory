package com.pattern.factory.simple;

import com.pattern.factory.TeLunsu;

/**
 * 小作坊式的工厂模式
 */
public class SimpleFatoryTest {

    public static void main(String[] args) {
        //这个new的过程实际是一个比较复杂的过程
        //有人民币不用自己new了
//        System.out.println(new TeLunsu());

        //小作坊生产模式
        // 不需要关心生产过程，只关心结果
        SimpleFactory fatory = new SimpleFactory();
        //把用户的需求告诉工厂，就把对应的产品给出来
        //创建产品的过程隐藏了，对应用户而言完全不清楚是怎样产生的

        System.out.println(fatory.getMike("特仑苏").getName());

    }


}
