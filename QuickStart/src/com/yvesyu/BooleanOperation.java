package com.yvesyu;

/**
 * @Package: com.yvesyu
 * @ClassName: BooleanOperation
 * @Desc: Boolean 运算
 * @Author: Yves Yu
 * @Create: 2023/1/17 - 15:50
 */
public class BooleanOperation {

    public static void main(String[] args) {

        /*
         * 对于布尔类型 boolean，永远只有 true 和 false 两个值
         * 布尔运算是一种关系运算
         */

        boolean isGreater = 5 > 3;
        System.out.println(isGreater);

        int age = 12;
        boolean isZero = age == 0;
        System.out.println(isZero);

        boolean isNonZero = !isZero;
        System.out.println(isNonZero);

        boolean isAdult = age >= 18;
        System.out.println(isAdult);

        boolean isTeenager = age >6 && age <18;
        System.out.println(isTeenager);

        // 布尔运算的一个重要特点是短路运算，如果一个布尔运算的表达式能提前确定结果，则后续的计算不再执行，直接返回结果
        boolean b = 5 < 3;
        boolean result = b && (5 / 0 > 0);
        System.out.println(result);

        // 三元运算符 b ? x : y，它根据第一个布尔表达式的结果，分别返回后续两个表达式之一的计算结果

        int n = 100;
        int x = n > 5 ? n : -n;
        System.out.println(x);

    }

}
